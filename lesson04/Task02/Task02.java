public class Task02 {

    public static void main(String[] args) {
        double r1 = 7.0;
        double r2 = 5.0;

        double s = RingLogic.CalcSquare(r1, r2);

        System.out.println(r2 != 0 ? s : "It's not a ring");
    }
}
