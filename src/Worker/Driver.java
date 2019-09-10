package Worker;

public class Driver extends Worker implements CanDrives {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Заправил машину и готов ехать хоть на край света");
    }
}
