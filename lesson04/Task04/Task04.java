public class Task04 {

    public static void main(String[] args) {
        int n = 231928;

        double gm = NumberLogic.CalcGeometricMean(n);
        double am = NumberLogic.CalcArithmeticMean(n);

        TaskPrinter.println(gm, am);


    }
}
