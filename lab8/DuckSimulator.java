public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new EchoCountingDuckFactory();

        duckSimulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory){

//        Quackable mallardDuck = new QuackEcho( new QuackCounter(new MallardDuck()));
//        Quackable redheadDuck = new QuackEcho(new QuackCounter(new RubberDuck()));
//        Quackable duckCall = new QuackEcho( new QuackCounter(new DuckCall()));
//        Quackable rubberDuck = new QuackEcho( new QuackCounter(new RubberDuck()));

//        Quackable mallardDuck = new QuackCounter( new QuackEcho(new MallardDuck()));
//        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
//        Quackable duckCall = new QuackCounter( new QuackEcho(new DuckCall()));
//        Quackable rubberDuck = new QuackCounter( new QuackEcho(new RubberDuck()));


        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubbleDuck();

        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigion = new PigionAdapter(new Pigion());

        System.out.println("\nDuck Simulator: with Composite - Flocks");

        Flock flockofDuck = new Flock();

        flockofDuck.add(redheadDuck);
        flockofDuck.add(duckCall);
        flockofDuck.add(rubberDuck);
        flockofDuck.add(goose);

        Flock flockofMallard = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockofMallard.add(mallardOne);
        flockofMallard.add(mallardTwo);
        flockofMallard.add(mallardThree);
        flockofMallard.add(mallardFour);

        flockofDuck.add(flockofMallard);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockofDuck);


//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(goose);
//        simulate(pigion);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + "times");

    }
    public void simulate(Quackable duck){
        duck.quack();
    }
}
