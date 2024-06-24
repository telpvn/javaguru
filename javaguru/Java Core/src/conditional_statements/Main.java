package conditional_statements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите число недели: \n");

        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            default:
                System.out.println("День недели должен быть в диапазоне 1 - 7 ");
        }
    }
}
