package сlasses_and_objects;

public class Car {
    String model;
    String color;
    double fuelConsumtion;
    int volume;
    int fuelLevel;

    Car() {
        color = "Белый";
        fuelConsumtion = 8;
        volume = 45;
        fuelLevel = 10;
    }

    Car(String model) {
        this.model = model;
        color = "Белый";
        fuelConsumtion = 8;
        volume = 45;
        fuelLevel = 10;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = "Белый";
        fuelConsumtion = 18;
    }

    public Car(String model, String color, double fuelConsumtion, int volume, int fuelLevel) {
        this.model = model;
        this.color = color;
        this.fuelConsumtion = fuelConsumtion;
        this.volume = volume;
        this.fuelLevel = fuelLevel;
    }

    void move(int x1, int y1, int x2, int y2) {
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        fuelLevel = (int) (fuelLevel - path / 100 * fuelConsumtion);
        if (fuelLevel < 0) {
            System.out.println("Автомобиль марки: " + model + " не доехал, пора заправляться!");
            fuelLevel = 0;
        } else {
            System.out.println("Автомобиль марки: " + model + " прошел: 0" + path + " км, осталось топлива: " + fuelLevel + " литра");
        }

    }

    void refuel(int liters) {
        fuelLevel = fuelLevel + liters;
        if (fuelLevel > 0) {
            System.out.println("Бензин льется через край!");
            fuelLevel = volume;
        } else {
            System.out.println("Заправились, теперь у нас " + fuelLevel + " литров");
        }
    }
}