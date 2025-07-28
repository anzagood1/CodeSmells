

public class CarWash {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Wash!");
        String carType = null; 
        Integer price= 0;
        switch (carType) {
            case "Sedan":
                price= 20;
                break;
            case "SUV":
                price= 30;
                break;
            case "Truck":
                price= 40;
                break;
            case "Van":
                price= 35;
                break;
            default:
                throw new AssertionError();
        }
        
    }
    



    
}
