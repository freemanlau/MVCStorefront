/**
 *  Main method to run the program
 * **/
public class StoreMain {

public static void main(String[] args) {
    StoreModel m = new StoreModel();
    StoreView v = new StoreView();
    StoreController c = new StoreController(m, v);
    c.controller();
}
}
