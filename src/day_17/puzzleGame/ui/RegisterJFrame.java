package day_17.puzzleGame.ui;

import javax.swing.*;
import java.awt.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame() throws HeadlessException {
        this.setSize(488, 500);
        this.setTitle("拼图注册");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
