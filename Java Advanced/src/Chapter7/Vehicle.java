package Chapter7;

public class Vehicle {
    //class or instance variable
    private String color;
    private String model;
    private int year;
    private String registrationNumber;
    private double mileage;
    private String transmissionType;

    /*
    default constructor with default values
     */
    public Vehicle(){
       this.mileage = 0;
    this.registrationNumber="None";
    this.color="Black";
    this.model="None";
    this.year=2002;
    this.transmissionType="Manual";
    }

    /*
     * Overloaded constructor for the Vehicle class.
     * Initializes a new Vehicle object with the given parameters.
     *
     * @param color - the color of the vehicle
     * @param model - the model of the vehicle
     * @param year - the manufacturing year of the vehicle
     * @param registrationNumber - the registration number of the vehicle
     * @param mileage - the mileage of the vehicle
     * @param transmissionType - the transmission type of the vehicle (e.g., automatic, manual)
     */
    public Vehicle(String color, String model, int year, String registrationNumber, double mileage, String transmissionType) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
        this.transmissionType = transmissionType;
    }


    /**
     Method to display Vehicle details
     */
    void display (){
        System.out.println("Milage : " +mileage +"\nReg# : "+registrationNumber
                +"\nColor# : "+color
                +"\nModel : "+model
                +"\nYear : "+year
                +"\nTransmission : "+transmissionType
                );
    }
}
