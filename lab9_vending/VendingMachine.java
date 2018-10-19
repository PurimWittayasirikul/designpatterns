import java.util.*;

public class VendingMachine {

    final static int ready =0;
    final static int paying =1;
    final static int fin=2;

    int state = ready;
    private double price=0 ;

    private int currentstation;
    private int destinationstation;

    private List<Station> stations = new ArrayList<>(Arrays.asList(new Station("ladpraw",1),
            new Station("paholyothin",3),
            new Station("houhin",10)));

    public VendingMachine(int currentstation) {
        this.currentstation =currentstation;

    }

    public void calculatePrice(int destinationstation){
        if (state==ready){
            state = paying;
            this.destinationstation =destinationstation;
            price += Math.abs(stations.get(currentstation).getPosition()- stations.get(destinationstation).getPosition())*Station.getPricePerDistance();
            System.out.println("your bill is "+price);
        }else if(state ==paying){
            System.out.println("can't calculate price,machine is paying");
        }else {
            System.out.println("can't calculate price,machine is finishing");
        }
    }

    public void insertCoin(double coin){
        System.out.println();
        if (state==paying){
            if (coin<price){
                System.out.println("not enough,you have to insert coint atleast "+price);
            }else if (coin==price){
                state=fin;
            }else {
                state=fin;
                System.out.println("your change is "+(coin-price));
            }
        }else if (state==ready){
            System.out.println("can't insert coin,you are not choose destination");
        }else if (state==fin){
            System.out.println("can't insert coin, machine is finishing");
        }
    }

    public void exit(){
        if (state==fin){
            state=ready;
            System.out.println("ticket: form "+stations.get(currentstation).getName()+" to "+stations.get(destinationstation).getName());
        }else {
            System.out.println("transaction is not finish");
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(0);
        vendingMachine.calculatePrice(2);
        vendingMachine.insertCoin(95);
        vendingMachine.exit();
        vendingMachine.insertCoin(4);
    }


}
