package Dispensables;

public class DuplicateCode {
    
    public double calculateRectangleArea(double width, double height) {

        if (width <= 0) {
            System.out.println("Error: Width must be positive");
            return -1;
        }
        if (height <= 0) {
            System.out.println("Error: Height must be positive");
            return -1;
        }
        
        double area = width * height;
        System.out.println("Calculating area...");
        System.out.println("Result: " + area);
        return area;
    }
    
   
    public double calculateSquareArea(double side) {
       
        if (side <= 0) {
            System.out.println("Error: Side must be positive");
            return -1;
        }
        
        double area = side * side;
        System.out.println("Calculating area...");
        System.out.println("Result: " + area);
        return area;
    }
    
   
    public double calculateTriangleArea(double base, double height) {
        
        if (base <= 0) {
            System.out.println("Error: Base must be positive");
            return -1;
        }
        if (height <= 0) {
            System.out.println("Error: Height must be positive");
            return -1;
        }
        
        double area = (base * height) / 2;
        System.out.println("Calculating area...");
        System.out.println("Result: " + area);
        return area;
    }
    
    
}
