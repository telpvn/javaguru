package conditional_statements;

public class Main {

    public static void main(String[] args) {
        int i = 100;
        System.out.println(isEven(i));
    }

    static String isEven(int i) {
        boolean isEven = (i % 2) == 0;
        if (isEven) {
            return "Четное";
        } else {
            return "Нечетное";
        }
    }
}
