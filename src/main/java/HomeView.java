import javax.swing.*;

public class HomeView {

    public static void createAndShowGUI() {

        JFrame frame = new JFrame("Automate the Boring Stuff: File Mover");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Let's move some files...");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}
