package methods;

public class Main {

    public static void main(String[] args) {
        int i = 348;
        print("Число: " + i + " четное " + isEven(i));
    }

    static boolean isEven(int i) {
        return (i % 2) == 0;
    }

    static void print(String str) {
        System.out.println(str);
    }

}
