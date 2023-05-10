package gui.frames;

public class Main {
    public static void main(String[] args) {

            //JFrame is a GUI window to add Components(the fundamental UI Objects in Java) to.

        /*
            JFrame frame = new JFrame();
            frame.setTitle("JFrame title goes here");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close
            frame.setResizable(false);
            frame.setSize(400,400);
            frame.setVisible(true);

            ImageIcon image = new ImageIcon("Java Learning\\GUI More\\logo.png");
            frame.setIconImage(image.getImage()); //sets icon of window
            frame.getContentPane().setBackground(Color.CYAN);
         */

        new MyFrame();

    }
}