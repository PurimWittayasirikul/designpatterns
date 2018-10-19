import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {



    @Test
    void getAvailableSeats() {
        SingleTour singleTour1 = new SingleTour("Phuket",600,30,5);
        SingleTour singleTour2 = new SingleTour("Beach",50,40,20);
        SingleTour singleTour3 = new SingleTour("phukradueng",300,60,25);
        PackageTour packageTour = new PackageTour("soutside", new ArrayList<Tour>(Arrays.asList(singleTour2,singleTour3)));

        assertEquals(20,packageTour.getAvailableSeats());
    }
}