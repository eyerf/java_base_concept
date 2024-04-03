package day_18.runtime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class MyJFrame extends JFrame implements MouseListener {

    JButton yesButton = new JButton("Yes, I'm handsome");
    JButton midButton = new JButton("Just so so");
    JButton noButton = new JButton("Not at all");
    boolean flag = false;
    JButton forgiveButton = new JButton("Ok, I admit I'm not handsome! Cancel the shutdown command.");
    int count = 0;

    public MyJFrame() {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();
        forgiveButton.setVisible(flag);
        forgiveButton.setBounds(50, 20, 400, 30);
        forgiveButton.addMouseListener(this);
        this.getContentPane().add(forgiveButton);
        JLabel text = new JLabel("Do you think you are handsome?");
        text.setBounds(45, 150, 800, 50);
        text.setFont(new Font(null, Font.BOLD, 25));
        yesButton.setBounds(130, 250, 200, 30);
        midButton.setBounds(130, 325, 200, 30);
        noButton.setBounds(130, 400, 200, 30);
        yesButton.addMouseListener(this);
        midButton.addMouseListener(this);
        noButton.addMouseListener(this);
        this.getContentPane().add(text);
        this.getContentPane().add(yesButton);
        this.getContentPane().add(midButton);
        this.getContentPane().add(noButton);
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        this.setSize(500, 600);
        this.setTitle("Handsome Test4");
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    public void showJDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setSize(350, 150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object object = e.getSource();
        if (object == yesButton) {
            showJDialog("You are TOO confident! Give you some punishment!");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            forgiveButton.setVisible(flag);
        } else if (object == midButton) {
            showJDialog("Be confident! Why don't you click the top button?");
        } else if (object == noButton) {
            count++;
            if (count == 5) {
                showJDialog("You are TOO unconfident! I'll give you some punishment!");
                try {
                    Runtime.getRuntime().exec("shutdown -s -t 60");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                showJDialog("Come on! Be confident! Don't say that!");
            }
        } else if (object == forgiveButton) {
            showJDialog("Fine, now we cancel the command.");
            flag = false;
            forgiveButton.setVisible(flag);
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}
