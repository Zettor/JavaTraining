 class NumberLogic {
    public static double CalcGeometricMean(int n) {
        int a = n % 10;
        n /= 10;

        int b = n % 10;
        n /= 10;

        int c = n % 10;
        n /= 10;

        int d = n % 10;
        n /= 10;

        int e = n % 10;

        int f = n / 10;

        return Math.pow(a * b * c * d * e * f, 1.0 / 6.0);
    }

    public static double CalcArithmeticMean(int n) {
        int a = n % 10;
        n /= 10;

        int b = n % 10;
        n /= 10;

        int c = n % 10;
        n /= 10;

        int d = n % 10;
        n /= 10;

        int e = n % 10;

        int f = n / 10;

        return (a + b + c + d + e + f) / 6.0;
    }
}
