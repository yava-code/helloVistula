import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculation with double");
        double price = 9.99;
        double vat = 1.23;

        double oneGross = price * vat;
        System.out.println("Gross for 1 item: " + oneGross);

        double totalGross = oneGross * 10000;
        System.out.println("Gross for 10,000 items: " + totalGross);

        double totalNet = totalGross / vat;
        System.out.println("Recalculated net: " + totalNet);

        System.out.println();

        System.out.println("Calculation with BigDecimal");
        BigDecimal priceBD = new BigDecimal("9.99");
        BigDecimal vatBD = new BigDecimal("1.23");

        BigDecimal oneGrossBD = priceBD.multiply(vatBD);
        System.out.println("Gross for 1 item: " + oneGrossBD);

        BigDecimal totalGrossBD = oneGrossBD.multiply(new BigDecimal("10000"));
        System.out.println("Gross for 10,000 items: " + totalGrossBD);

        BigDecimal totalNetBD = totalGrossBD.divide(vatBD, 2, RoundingMode.HALF_UP);
        System.out.println("Recalculated net: " + totalNetBD);
    }
}
