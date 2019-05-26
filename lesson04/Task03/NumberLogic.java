public class NumberLogic {

    public static boolean check(int n) {
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        int d = (n / 1000);

        return (a < b && b < c && c < d) || (a > b && b > c && c > d);
    }

}
