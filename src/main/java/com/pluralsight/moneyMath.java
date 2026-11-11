package com.pluralsight;

import java.math.BigDecimal;

public class moneyMath {
    public static void main(String[] args) {
        BigDecimal deci = BigDecimal.ZERO;
        float flo = 0.0f;
        double doub = 0.0;

        for (int i = 0; i < 100; i++) {
            deci = deci.add(new BigDecimal("0.10"));
            flo += 0.10f;
            doub += 0.10;

        }
        System.out.println("BigDecimal: " + deci + " Float: " + flo + " Double: " + doub);

        deci = BigDecimal.ZERO;
        flo = 0.0f;
        doub = 0.0;

        for (int i = 0; i < 1000; i++) {
            deci = deci.add(new BigDecimal("19.99"));
            flo += 19.99f;
            doub += 19.99;

        }
        System.out.println("BigDecimal: " + deci + " Float: " + flo + " Double: " + doub);
        System.out.println(flo == doub);
        System.out.println(deci.compareTo(BigDecimal.valueOf(doub)));
    }

}
