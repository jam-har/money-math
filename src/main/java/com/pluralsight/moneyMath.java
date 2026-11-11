import java.math.BigDecimal;
import java.util.*;

public class moneyMath {
    public static void main(String[] args) {
        BigDecimal deci = BigDecimal.ZERO;
        float flo = 0.0f;
        double doub = 0.0;

        for (int i = 0; i < 100; i++) {
            deci = deci.add(new BigDecimal("0.10"));
            flo += 0.1f;
            doub += 0.1;

        }

        System.out.println("BigDecimal: " + deci + " Float: " + flo + " Double: " + doub);
    }
}
