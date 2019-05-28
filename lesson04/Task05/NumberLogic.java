public class NumberLogic {

    public static int reverse(int n) {
        int posHelper = 1000000;

        int a = n % 10 * posHelper;
        n /= 10;
        posHelper /= 10;

        int b = n % 10 * posHelper;
        n /= 10;
        posHelper /= 10;

        int c = n % 10 * posHelper;
        n /= 10;
        posHelper /= 10;

        int d = n % 10 * posHelper;
        n /= 10;
        posHelper /= 10;

        int e = n % 10 * posHelper;
        n /= 10;
        posHelper /= 10;

        int f = n % 10 * posHelper;
        n /= 10;
        posHelper /= 10;

        int g = n * posHelper;

        return a + b + c + d + e + f + g;
    }
}
