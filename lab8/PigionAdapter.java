public class PigionAdapter implements Quackable {
    private Pigion pigion;
    public PigionAdapter(Pigion pigion) {
        this.pigion = pigion;
    }

    @Override
    public void quack() {
        pigion.coo();
        pigion.coo();
    }
}
