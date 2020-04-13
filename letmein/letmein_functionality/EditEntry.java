public class EditEntry implements Command {
    // Access database at this point?
    Receiver entry;

    public EditEntry(Receiver entry) {
        this.entry = entry;
    }

    @Override
    public void execute() {
        // will do something like entry.add();
        entry.edit();
    }
}