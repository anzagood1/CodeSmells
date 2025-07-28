
public class Client {
    private String telefono;

    public String getTelefonoFormateado() {
        return "(" + telefono.substring(0, 3) + ") " + telefono.substring(3);
    }

}