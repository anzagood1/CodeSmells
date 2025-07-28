
public class AdminNotifier extends Notifier{
    public void notify(User user) {
        System.out.println("Notificando al administrador: " + user.name);
    }
}
