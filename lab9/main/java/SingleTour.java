public class SingleTour implements Tour{

    private String name;
    private double price;
    private int allseats;
    private  int reservedSeats;

    public SingleTour(String name, double price, int allseats, int reservedSeats) {
        this.name = name;
        this.price = price;
        this.allseats = allseats;
        this.reservedSeats = reservedSeats;
    }


    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }


    public int getAvailableSeats() {
        return allseats-reservedSeats;
    }

    public int getReservedSeats(){
        return reservedSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAllseats(int allseats) {
        this.allseats = allseats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }
}
