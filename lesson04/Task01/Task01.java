public class Task01 {

    public static void main(String[] args) {
        double a = 7;
        double b = 6;
        double c = 8;

        boolean isEqual = EqualTest.compare(a, b, c);
        boolean isDifferent = DifferentTest.compare(a, b, c);

        Printer.println(" Variables a, b, c are equal : " + isEqual);
        Printer.println(" Variables a, b, c are different : " + isDifferent);
    }
}
