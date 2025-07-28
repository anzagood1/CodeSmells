package Bloaters;

public class PrimitiveObsession {

    private String Email;
    private String Telefono;
    private String Direccion;
    
    
    private double precio;
    private String moneda;
    
  
    private double latitud;
    private double longitud;
    

    private String fechaInicio; 
    private String fechaFin;   
    
    
 
    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double deltaLat = lat2 - lat1;
        double deltaLon = lon2 - lon1;
        return Math.sqrt(deltaLat * deltaLat + deltaLon * deltaLon);
    }
    
    public boolean isValidEmailFormat(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
    
    public void setCustomerInfo(String email, String phone, String address) {
        
        this.Email = email;
        this.Telefono = phone;
        this.Direccion = address;
    }
    
    // Getters and setters using primitives (part of the smell)
    public String getCustomerEmail() {
        return Email;
    }
    
    public void setCustomerEmail(String customerEmail) {
        this.Email = customerEmail;
    }
    
    public String getCustomerPhone() {
        return Telefono;
    }
    
    public void setCustomerPhone(String customerPhone) {
        this.Telefono = customerPhone;
    }
    
    public double getPrice() {
        return precio;
    }
    
    public void setPrice(double precio) {
        this.precio = precio;
    }
    
    public String getCurrency() {
        return moneda;
    }
    
    public void setCurrency(String moneda) {
        this.moneda = moneda;
    }
}
