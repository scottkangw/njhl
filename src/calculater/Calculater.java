package calculater;
public class Calculater {
Interface cal = new Interface();
    public static void main(String[] args) {
Calculater execute = new Calculater();
        execute.call();
    }
    public void call() {
        cal.setVisible(true);
    }
    
}
