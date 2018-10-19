import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SingleTourTest {

   private SingleTour singleTour1;

    @BeforeEach
   void init(){
        singleTour1 = new SingleTour("Phuket",600,30,5);

   }

    @Test
    void getAvailableSeats() {
       assertEquals(25,singleTour1.getAvailableSeats());
    }

    @Test
    void getReservedSeats() {
        assertEquals(5,singleTour1.getReservedSeats());
    }

    @Test
    void test_availableSeate_after_reservedSeateIncress(){
        assertEquals(25,singleTour1.getAvailableSeats());
        singleTour1.setReservedSeats(10);
        assertEquals(20,singleTour1.getAvailableSeats());
    }

}