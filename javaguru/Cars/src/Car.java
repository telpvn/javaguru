public class Car {
    String model;
    String color;
    double fuelConsumtion;
    int volume;
    int fuelLevel;

    void move(int x1, int y1, int x2, int y2) {
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        fuelLevel = (int) (fuelLevel - path / 100 * fuelConsumtion);
        if (fuelLevel < 0) {
            System.out.println("Автомобиль " + model + " не доехал, пора заправиться!");
        } else {
            System.out.println("Автомобиль " + model + " прошел: 0" + path + " км. осталось топлива: " + fuelLevel + " литра");
        }
    }

    public static void main(String[] args) {
        Car opel = new Car();
        opel.model = "Opel";
        opel.color = "Желтый";
        opel.volume = 45;
        opel.fuelLevel = 15;
        opel.fuelConsumtion = 8;

        opel.move(10, 10, 100, 100);

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.color = "Черный";
        bmw.volume = 60;
        bmw.fuelLevel = 60;
        bmw.fuelConsumtion = 12;

        bmw.move(0, 0, 500, 300);
    }
}
