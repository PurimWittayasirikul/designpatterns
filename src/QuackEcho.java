public class QuackEcho implements Quackable {
    private Quackable duck;


    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        echo();
    }
    private void echo(){
        System.out.println("Echo:");
        duck.quack();
    }
}
