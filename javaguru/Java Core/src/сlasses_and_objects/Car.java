package сlasses_and_objects;

public class Car {
    String model;
    String color;
    double fuelConsumtion;
    int volume;
    int fuelLevel;

    void move(int x1, int y1, int x2, int y2) {
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(path);
    }
}