public class NumberLogic {
    public static double CalcGeometricMean(int n) {
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        int d = (n / 1000) % 10;
        int e = (n / 10000) % 10;
        int f = n / 100000;

        return Math.pow(a * b * c * d * e * f, 1.0 / 6.0);
    }

    public static double CalcArithmeticMean(int n) {
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        int d = (n / 1000) % 10;
        int e = (n / 10000) % 10;
        int f = n / 100000;

        return (a + b + c + d + e + f) / 6.0;
    }
}

