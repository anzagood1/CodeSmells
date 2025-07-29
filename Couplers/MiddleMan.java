package Couplers;

public class MiddleMan {
    
    private Calculator calculator;
    
    public MiddleMan() {
        this.calculator = new Calculator();
    }
    
    public int add(int a, int b) {
        return calculator.add(a, b);
    }
    
    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }
    
    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }
    
    public double divide(int a, int b) {
        return calculator.divide(a, b);
    }
    
    public void reset() {
        calculator.reset();
    }
}


class Calculator {
    private int lastResult;
    
    public Calculator() {
        this.lastResult = 0;
    }
    
    public int add(int a, int b) {
        lastResult = a + b;
        return lastResult;
    }
    
    public int subtract(int a, int b) {
        lastResult = a - b;
        return lastResult;
    }
    
    public int multiply(int a, int b) {
        lastResult = a * b;
        return lastResult;
    }
    
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        }
        return 0;
    }
    
    public void reset() {
        lastResult = 0;
    }
}