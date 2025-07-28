package Bloaters;

public class DataClumps {
    
    //Atributos que facilmente podrian ser una clase
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPhone;
    
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;
    private String shippingCountry;
    
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
   
    

    public void createCustomer(String firstName, String lastName, String email, String phone) {
        System.out.println("Creating customer: " + firstName + " " + lastName);
        System.out.println("Email: " + email + ", Phone: " + phone);
    }
    
    public void updateCustomer(int customerId, String firstName, String lastName, String email, String phone) {
        System.out.println("Updating customer " + customerId);
        System.out.println("New info: " + firstName + " " + lastName + ", " + email + ", " + phone);
    }
    
    public void sendWelcomeEmail(String firstName, String lastName, String email, String phone) {
        System.out.println("Sending welcome email to: " + firstName + " " + lastName);
        System.out.println("Email address: " + email);
    }
    

    public void saveShippingAddress(String street, String city, String state, String zipCode, String country) {
        System.out.println("Saving shipping address:");
        System.out.println(street + ", " + city + ", " + state + " " + zipCode + ", " + country);
    }
    
    public void saveBillingAddress(String street, String city, String state, String zipCode, String country) {
        System.out.println("Saving billing address:");
        System.out.println(street + ", " + city + ", " + state + " " + zipCode + ", " + country);
    }
    
    public double calculateShippingCost(String street, String city, String state, String zipCode, String country) {

        System.out.println("Calculating shipping to: " + city + ", " + state + ", " + country);
        return 10.99; 
    }
    
    
    public void generateReport(String startDate, String endDate, String reportType) {
        System.out.println("Generating " + reportType + " report from " + startDate + " to " + endDate);
    }
    
    public void exportData(String startDate, String endDate, String format) {
        System.out.println("Exporting data from " + startDate + " to " + endDate + " in " + format + " format");
    }
    
    public void scheduleBackup(String startDate, String endDate, String frequency) {
        System.out.println("Scheduling backup from " + startDate + " to " + endDate + " every " + frequency);
    }
    
    
    public double calculateDistance(double startLat, double startLon, double endLat, double endLon) {
        double deltaLat = endLat - startLat;
        double deltaLon = endLon - startLon;
        return Math.sqrt(deltaLat * deltaLat + deltaLon * deltaLon);
    }
    
    public void saveLocation(String locationName, double latitude, double longitude) {
        System.out.println("Saving location " + locationName + " at (" + latitude + ", " + longitude + ")");
    }
    
    public boolean isNearby(double userLat, double userLon, double storeLat, double storeLon, double maxDistance) {
        double distance = calculateDistance(userLat, userLon, storeLat, storeLon);
        return distance <= maxDistance;
    }
    
    
    public void setBackgroundColor(int red, int green, int blue) {
        System.out.println("Setting background color: RGB(" + red + ", " + green + ", " + blue + ")");
    }
    
    public void setTextColor(int red, int green, int blue) {
        System.out.println("Setting text color: RGB(" + red + ", " + green + ", " + blue + ")");
    }
    
    public String getColorHex(int red, int green, int blue) {
        return String.format("#%02X%02X%02X", red, green, blue);
    }
    

}
