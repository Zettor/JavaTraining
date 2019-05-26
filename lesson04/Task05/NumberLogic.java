 class NumberLogic {

    public static int reverse(int n) {
        int a = n % 10 * 1000000;
        n /= 10;

        int b = n % 10 * 100000;
        n /= 10;

        int c = n % 10 * 10000;
        n /= 10;

        int d = n % 10 * 1000;
        n /= 10;

        int e = n % 10 * 100;
        n /= 10;

        int f = n % 10 * 10;

        int g = n / 10;

        return a  + b +  c +  d +  e +  f +  g;
    }
}
