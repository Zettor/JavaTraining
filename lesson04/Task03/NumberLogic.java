 class NumberLogic {

    public static boolean check(int n) {
        int a = n % 10;
        n /= 10;

        int b = n % 10;
        n /= 10;

        int c = n % 10;

        int d = n / 10;

        return (a < b && b < c && c < d) || (a > b && b > c && c > d);
    }

}
