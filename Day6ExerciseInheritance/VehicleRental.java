
class Vehicle {
    String make, model;
    int year;
    double rentalPricePerDay;

    public Vehicle(String make, String model, int year, double rentalPricePerDay){
       this.make = make;
       this.model = model;
       this.year = year;
       this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getMake(){
         return make;
    }
    
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getRentalPrice(){
        return rentalPricePerDay;
    }

    public double calculateRentalCost(int days){
        double rentalCost = rentalPricePerDay * days;
        return rentalCost;
    }}

    class Car extends Vehicle{
       int numSeats;
       int numDoors;

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors){
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    public int getNumSeats(){
        return numSeats;
    }

    public int getNumDoors(){
        return numDoors;
    }
}

    class Motorcycle extends Vehicle{
       int engineSize;

       public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize){
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }
       
    public int getEngine(){
        return engineSize;
    }
    }


 public class VehicleRental{
    public static void main (String[] args) {
          Car cars = new Car("Perodua", "Myvi", 2019, 120, 4, 4);
          Motorcycle motor = new Motorcycle("Yamaha", "Y15", 2017, 30, 40);
          
          int days = 2;
          
          System.out.println("Make: " + cars.getMake());
          System.out.println("Model: " + cars.getModel());
          System.out.println("Year: " + cars.getYear());
          System.out.println("Rental Price per Day:RM" + cars.getRentalPrice());
          System.out.println("Number of Seats: " + cars.getNumSeats());
          System.out.println("Number of Doors: " + cars.getNumDoors());
          System.out.println("Rental Days: " + days + "\n");
          System.out.println("Total Rental Cost:RM " +  cars.calculateRentalCost(days));
          System.out.println("");

          System.out.println("Make: " + motor.getMake());
          System.out.println("Model: " + motor.getModel());
          System.out.println("Year: " + motor.getYear());
          System.out.println("Rental Price per Day:RM" + motor.getRentalPrice());
          System.out.println("Engine Size: " + motor.getEngine());
          System.out.println("Rental Days: " + days + "\n");
          System.out.println("Total Rental Cost:RM " +  motor.calculateRentalCost(days));
    
    }
 }



