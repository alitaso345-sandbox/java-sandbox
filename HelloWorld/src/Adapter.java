public class Adapter extends Target {
    private OldSystem oldSystem;

    public Adapter() {
        this.oldSystem = new OldSystem();
    }

    @Override
    public void process() {
        this.oldSystem.oldProcess();
    }
}
