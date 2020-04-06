public class DeleteEntry implements Command {
    // Access database at this point?
    Receiver entry;

    public DeleteEntry(Receiver entry) {
        this.entry = entry;
    }

    @Override
    public void execute() {
        // will do something like entry.add();
        entry.delete();
    }
}