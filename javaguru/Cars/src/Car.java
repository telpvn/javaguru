public class Car {
    String model;
    static String color;
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
        this.color = color;
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
            System.out.println("Автомобиль " + model + " не доехал, пора заправиться!");
            fuelLevel = 0;
        } else {
            System.out.println("Автомобиль " + model + " прошел: 0" + path + " км. осталось топлива: " + fuelLevel + " литра");
        }
    }

    void refuel(int liters) {
        fuelLevel += liters;
        if (fuelLevel > volume) {
            System.out.println("Бензин льется через край!");
            fuelLevel = volume;
        } else {
            System.out.println("Заправились, теперь у нас " + fuelLevel + " литров");
        }
    }

    public static void main(String[] args) {
        Car opel = new Car("Opel");
        Car bmw = new Car("BMW", "Черный");
        opel.color = "Синий";

        System.out.println(opel.color);
        System.out.println(bmw.color);
        System.out.println(Car.color);
    }
}
