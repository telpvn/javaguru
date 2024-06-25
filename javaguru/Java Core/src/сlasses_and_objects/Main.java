package сlasses_and_objects;

public class Main {

    public static void main(String[] args) {
        Car opel = new Car("Opel");
        opel.color = "Желтый";
        opel.move(10, 10, 100, 100);

        Car bmw = new Car("BMW", "Черный");
        bmw.volume = 60;

        bmw.move(0, 0, 500, 300);
        bmw.refuel(50);
        bmw.move(150, 150, 500, 300);

    }
}
