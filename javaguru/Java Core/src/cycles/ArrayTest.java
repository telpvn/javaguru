package cycles;

public class ArrayTest {
    public static void main(String[] args) {
        cycleTest();
    }

    static void cycleTest() {
        for (int i = 0; i < 8; i += 3) {
            System.out.println(i);
        }
    }
}

