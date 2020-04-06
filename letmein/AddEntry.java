public class AddEntry implements Command {
    // Access database at this point?
    Receiver entry;

    public AddEntry(Receiver entry) {
        this.entry = entry;
    }

    @Override
    public void execute() {
        // will do something like entry.add();
        entry.add();
    }
}