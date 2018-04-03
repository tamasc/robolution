import javax.swing.*;
import java.awt.*;

public class Renderer {
    Robot robot;
    Delos delos;
    private JFrame frame;
    private Canvas canvas;
    private String title;
    private int width, height;


    public Renderer(Robot robot, Delos delos, String title, int width, int height) {
        this.robot = robot;
        this.delos = delos;
        this.frame = frame;
        this.title = title;
        this.width = width;
        this.height = height;
        this.createDisplay();

    }

    public static void clearConsole() {
        //  ANSI escape codes: 33 octal escape, Esc[2J clear display
        System.out.print("\033[2J");
        System.out.flush();
    }

    private void createDisplay() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        frame.add(canvas);
        // resize window to fit canvas
        frame.pack();
    }
}
