public class Ostrich extends Bird{
    String name;

    public Ostrich(String name){
        super(name);
        this.name = name;    
    }

    public void fly(){
        throw new UnsupportedOperationException();
    }
    
}
