/**
 *  Class that stores the information for the store (Item names, prices, and descriptions
 * **/
public class StoreModel {
    //array that stores the different item names
    private String[] itemName = {"Turing Tumble", "Cubetto Coding", "Doodlematic Development"};

    //array that stores the different item descriptions
    private String[] itemDescription = {"Build a computer powered by marbles - it's fun," +
            " and you'll learn how computers work!",
            "Kids help Cubetto, a friendly wooden robot, " +
                    "find his way home using hands-on blocks to write their first programs.",
            "Use colored markers and paper to turn hand-drawn" +
            " concepts into instantly playable video games!"};

    //array that stores the different item prices
    private double[] itemPrice = {59.95, 102.22, 29.99};

    //method to return the name of an item given the index
    public String getItemName(int itemNum) {
        return itemName[itemNum];
    }

    //method to return the description of an item given the index
    public String getItemDescription(int itemNum) {
        return itemDescription[itemNum];
    }

    //method to return the price of an item given the index
    public double getItemPrice(int itemNum) {
        return itemPrice[itemNum];
    }

}
