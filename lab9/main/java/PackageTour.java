import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageTour implements Tour {

    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    public PackageTour(String packageName, List<Tour> tours) {
        this.packageName = packageName;
        this.tours = tours;
    }


    public String getName() {
        return packageName;
    }


    public Double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }


    public int getAvailableSeats() {
        int total = 9999;

        for (Tour t : tours) {
            total = Math.min(total,t.getAvailableSeats());
        }
        return total;
    }

    public static void main(String[] args) {

        SingleTour singleTour1 = new SingleTour("Phuket",600,30,5);
        SingleTour singleTour2 = new SingleTour("Beach",50,40,20);
        SingleTour singleTour3 = new SingleTour("phukradueng",300,60,25);
        PackageTour packageTour = new PackageTour("soutside", new ArrayList<Tour>(Arrays.asList(singleTour2,singleTour3)));


        System.out.println(singleTour1.getName()+" "+singleTour1.getPrice()+" "+singleTour1.getAvailableSeats());
        System.out.println(singleTour2.getName()+" "+singleTour2.getPrice()+" "+singleTour2.getAvailableSeats());
        System.out.println(singleTour3.getName()+" "+singleTour3.getPrice()+" "+singleTour3.getAvailableSeats());
        System.out.println(packageTour.getName()+" "+packageTour.getPrice()+" "+packageTour.getAvailableSeats());


    }
}
