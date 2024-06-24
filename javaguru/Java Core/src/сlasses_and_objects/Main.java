package сlasses_and_objects;

public class Main {

    public static void main(String[] args) {
        Car opel = new Car();
        opel.model = "Opel";
        opel.color = "Желтый";

        opel.move(10, 10, 100, 100);
    }
}
