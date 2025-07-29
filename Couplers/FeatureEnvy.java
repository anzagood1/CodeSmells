package Couplers;

public class FeatureEnvy {
    
    private String calculatorName;
    
    public FeatureEnvy(String name) {
        this.calculatorName = name;
    }
    
    public double calculateSalary(Person person) {
        double baseSalary = person.getBaseSalary();
        int experience = person.getExperience();
        String department = person.getDepartment();
        
        double bonus = 0;
        if (experience > 5) {
            bonus = baseSalary * 0.2;
        }
        if (department.equals("IT")) {
            bonus += 1000;
        }
        
        return baseSalary + bonus;
    }
    
    public boolean isValidEmployee(Person person) {
        return person.getName() != null && 
               person.getBaseSalary() > 0 && 
               person.getExperience() >= 0;
    }
}

class Person {
    private String name;
    private double baseSalary;
    private int experience;
    private String department;
    
    public Person(String name, double baseSalary, int experience, String department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.experience = experience;
        this.department = department;
    }
    
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public int getExperience() { return experience; }
    public String getDepartment() { return department; }
}