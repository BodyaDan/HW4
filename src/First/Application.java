package First;

public class Application {
    public static void main(String[] args) {
        Robot[] array = {new Robot(), new CoffeRobot(), new RobotCoocker(), new RobotDancer()};

        for (int i = 0; i < array.length; i++)
            array[i].work();
    }
}
