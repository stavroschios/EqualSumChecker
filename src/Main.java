public class Main {



    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 1)); // true

    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else return false;

    }
}
