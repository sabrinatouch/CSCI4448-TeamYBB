public class Receiver {
    // public action_addEntry();
    // public action_deleteEntry();
    // public action_editEntry();

    public void add() {
        // might be calling the get and set methods in Entry.java ???
        System.out.println("add() in Receiver has been called.");
    }

    public void delete() {
        System.out.println("delete() in Receiver has been called.");
    }

    public void edit() {
        System.out.println("edit() in Receiver has been called.");
    }
}