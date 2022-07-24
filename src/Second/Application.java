package Second;

public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal("Леопард", 20, 7);

        System.out.println("Назва тварини = " + animal.getName() + ", швидкість тварини = " + animal.getSpeed() +
                 "(км/год), вік тварини = " + animal.getAge());

        animal.setAge(14);
        animal.setName("Бик");
        animal.setSpeed(2.2);

        System.out.println("Назва тварини = " + animal.getName() + ", швидкість тварини = " + animal.getSpeed() +
                "(км/год), вік тварини = " + animal.getAge());
    }
}
