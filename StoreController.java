/**
 *  Class that communicates the information between the StoreView and the StoreModel
 * **/

import javax.swing.JOptionPane;
import javax.swing.JButton;

public class StoreController {
    private StoreModel model;
    private StoreView view;

    //initializes the model and view
    public StoreController(StoreModel m, StoreView v) {
        model = m;
        view = v;
        setView();
    }

    //sets the names for the buttons with their actual product names
    public void setView(){
        //creates new buttons with the correct names
        JButton button1 = new JButton(model.getItemName(0));
        JButton button2 = new JButton(model.getItemName(1));
        JButton button3 = new JButton(model.getItemName(2));

        //updates the buttons displayed
        view.setButton1(button1);
        view.setButton2(button2);
        view.setButton3(button3);


    }

    //sets the action listeners for the buttons
    public void controller() {
        view.getButton1().addActionListener(e -> itemListing(0));
        view.getButton2().addActionListener(e -> itemListing(1));
        view.getButton3().addActionListener(e -> itemListing(2));
    }

    //opens a popup window with extended information for the item selected
    private void itemListing(int item){
        JOptionPane.showMessageDialog(null,
                model.getItemDescription(item) + " Price: $" +
                model.getItemPrice(item), model.getItemName(item), JOptionPane.INFORMATION_MESSAGE);
    }
}


