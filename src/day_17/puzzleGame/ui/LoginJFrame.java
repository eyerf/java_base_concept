package day_17.puzzleGame.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("zhangsan","123"));
        list.add(new User("lisi","1234"));
    }

    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel codeText = new JLabel(new ImageIcon("image\\login\\验证码.png"));
    JTextField code = new JTextField();
    JLabel rightCode = new JLabel();

    public LoginJFrame() throws HeadlessException {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        codeText.setBounds(133, 256, 50, 30);

        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        generateCode();
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        rightCode.addMouseListener(this);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        login.addMouseListener(this);
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.addMouseListener(this);
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }

    private void initJFrame() {
        this.setSize(488, 430);//设置宽高
        this.setTitle("拼图游戏 V1.0");//设置标题
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }

    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == login) {
            login.setIcon(new ImageIcon("image\\login\\登录按下.png"));
        } else if (obj == register) {
            register.setIcon(new ImageIcon("image\\login\\注册按下.png"));
        } else if (obj == rightCode) {
            generateCode();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == login) {
            login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
            String typedUsername = username.getText();
            String typedPassword = new String(password.getPassword());
            String typedCodeText = code.getText();
            if (!typedCodeText.equalsIgnoreCase(rightCode.getText())) {
                showJDialog("验证码输入错误，请重新输入!");
                generateCode();
            } else {
                if (typedUsername.isEmpty() || typedPassword.isEmpty()) {
                    showJDialog("用户名或密码不能为空!");
                    generateCode();
                }
                else {
                    if(checkUsernameAndPassword(typedUsername, typedPassword)) {
                        showJDialog("登录成功!");
                        this.setVisible(false);
                        new GameJFrame();
                    } else {
                        showJDialog("登录失败!用户名或密码错误!");
                        generateCode();
                    }
                }
            }
        } else if (obj == register) {
            register.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        }
    }

    private void generateCode() {
        String codeStr = CodeUtil.getCode();
        rightCode.setText(codeStr);
    }

    private boolean checkUsernameAndPassword(String typedUsername, String typedPassword) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(typedUsername) && list.get(i).getPassword().equals(typedPassword)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
