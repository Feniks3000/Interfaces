package Worker;

public class Cook extends Worker implements CanCooks{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cookFood() {
        System.out.println("Начал готовить вкусное блюдо");
    }
}
