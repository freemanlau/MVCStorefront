import javax.swing.*;
import java.awt.*;

/**
 *  Class that displays the information for the store (The GUI)
 * **/

public class StoreView {

    //initializes the buttons, though they'll be written over by the controller's setView later
    private JButton button1 = new JButton("Item 1");
    private JButton button2 = new JButton("Item 2");
    private JButton button3 = new JButton("Item 3");

    public StoreView() {

        JFrame frame = new JFrame();

        //title message
        JLabel welcome = new JLabel("Welcome to the STEM Toy Store!");

        //creates the display with the buttons and labels
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(welcome);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("STEM Toy Storefront");
        frame.pack();
        frame.setVisible(true);

    }

    //returns the first button
    public JButton getButton1(){
        return button1;
    }

    //sets the first button
    public void setButton1(JButton item1){
        this.button1 = item1;
    }

    //returns the second button
    public JButton getButton2(){
        return button2;
    }

    //sets the second button
    public void setButton2(JButton item2){
        this.button2 = item2;
    }

    //returns the third button
    public JButton getButton3(){
        return button3;
    }

    //sets the third button
    public void setButton3(JButton item3){
        this.button3 = item3;
    }
}

