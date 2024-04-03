package day_17.puzzleGame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] data = new int[4][4];
    int x = 0;
    int y = 0;
    String path = "D:\\code\\java_base_concept\\src\\day_17\\puzzleGame\\image\\girl\\girl3\\";
    int[][] win = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    int step = 0;

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("赵国生辉");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sports = new JMenuItem("运动");


    public GameJFrame() throws HeadlessException {
        initJFrame();

        initJMenuBar();

        initData();

        initImage();

        this.setVisible(true);
    }

    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        shuffle(tempArr);
        data = change(tempArr);
    }

    private int[][] change(int[] tempArr) {
        int[][] result = new int[4][4];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int i1 = 0; i1 < result[i].length; i1++) {
                if(tempArr[index] == 0) {
                    x = i;
                    y = i1;
                }
                result[i][i1] = tempArr[index];
                index++;
            }
        }
        return result;
    }

    private static void shuffle(int[] tempArr) {
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            swap(tempArr, i, index);
        }
    }

    private static void swap(int[] tempArr, int i, int index) {
        int num = tempArr[i];
        tempArr[i] = tempArr[index];
        tempArr[index] = num;
    }

    private void initImage() {
        this.getContentPane().removeAll();

        if(victory()) {
            JLabel windJLabel = new JLabel(new ImageIcon("image\\win.png"));
            windJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(windJLabel);
        }

        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path + (number) + ".jpg"));
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                this.getContentPane().add(jLabel);
            }
        }

        JLabel backGround = new JLabel(new ImageIcon("image\\background.png"));
        backGround.setBounds(40, 40, 508, 560);
        this.getContentPane().add(backGround);

        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changePicture = new JMenu("更换图片");
        functionJMenu.add(changePicture);
        changePicture.add(girl);
        changePicture.add(animal);
        changePicture.add(sports);



        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sports.addActionListener(this);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (victory()) {
            return;
        }
        if(code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
        }

        JLabel backGround = new JLabel(new ImageIcon("image\\background.png"));
        backGround.setBounds(40, 40, 508, 560);
        this.getContentPane().add(backGround);

        this.getContentPane().repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }

        int code = e.getKeyCode();
        if(code == 37) {
            if(y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            if(x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {
            if(y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if(code == 40) {
            if(x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
            x = 3;
            y = 3;
            initImage();
        }
    }

    private boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            step = 0;
            initData();
            initImage();
        } else if (obj == reLoginItem) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.exit(0);
        } else if (obj == accountItem) {
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.jpg"));
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(458, 458);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (obj == girl) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            shuffle(nums);
            int num = nums[0];
            path = "image\\girl\\girl" + num + "\\";
            step = 0;
            initData();
            initImage();
        } else if (obj ==  animal) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
            shuffle(nums);
            int num = nums[0];
            path = "image\\animal\\animal" + num + "\\";
            step = 0;
            initData();
            initImage();
        } else if (obj == sports) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            shuffle(nums);
            int num = nums[0];
            path = "image\\sport\\sport" + num + "\\";
            step = 0;
            initData();
            initImage();
        }
    }
}
