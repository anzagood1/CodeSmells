package Couplers;

public class MessageChains {
    
    private Car car;
    
    public MessageChains() {
        this.car = new Car();
    }
    
    public String getDriverName() {
        return car.getDriver().getPerson().getName();
    }
    
    public int getDriverAge() {
        return car.getDriver().getPerson().getAge();
    }
    
    public String getEngineType() {
        return car.getEngine().getSpecs().getType();
    }
}

class Car {
    private Driver driver;
    private Engine engine;
    
    public Car() {
        this.driver = new Driver();
        this.engine = new Engine();
    }
    
    public Driver getDriver() {
        return driver;
    }
    
    public Engine getEngine() {
        return engine;
    }
}

class Driver {
    private Person person;
    
    public Driver() {
        this.person = new Person();
    }
    
    public Person getPerson() {
        return person;
    }
}

class Person {
    private String name;
    private int age;
    
    public Person() {
        this.name = "Juan";
        this.age = 30;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Engine {
    private EngineSpecs specs;
    
    public Engine() {
        this.specs = new EngineSpecs();
    }
    
    public EngineSpecs getSpecs() {
        return specs;
    }
}

class EngineSpecs {
    private String type;
    
    public EngineSpecs() {
        this.type = "V8";
    }
    
    public String getType() {
        return type;
    }
}