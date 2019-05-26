public class NumberLogic {

    public static int reverse(int n) {
        int a = n % 10 * 1000000;
        int b = (n / 10) % 10 * 100000;
        int c = (n / 100) % 10 * 10000;
        int d = (n / 1000) % 10 * 1000;
        int e = (n / 10000) % 10 * 100;
        int f = (n / 100000) % 10 * 10;
        int g = (n / 1000000);

        return a + b + c + d + e + f + g;
    }
}
