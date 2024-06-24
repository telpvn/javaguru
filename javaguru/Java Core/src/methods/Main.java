package methods;

public class Main {

    public static void main(String[] args) {
        int j = 3;
        boolean result = isEven(348);
        System.out.println(result);
    }

    static boolean isEven(int i) {
        boolean isEven = (i % 2) == 0;
        return isEven;
    }

}
