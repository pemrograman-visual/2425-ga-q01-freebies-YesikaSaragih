// 12S24024 - Yesika Nadia Saragih
// 12S24027 - Grasia Gayatri Simanullang

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double totalHarga, hargaBuku, termurah;

        totalHarga = 0;
        hargaBuku = 0;
        hargaBuku = input.nextDouble();
        termurah = 1000;
        while (hargaBuku != 0) {
            if (termurah <= hargaBuku) {
                hargaBuku = hargaBuku;
            } else {
                termurah = hargaBuku;
            }
            totalHarga = totalHarga + hargaBuku;
            hargaBuku = input.nextDouble();
        }
        if (totalHarga >= 100.0) {
            totalHarga = totalHarga - termurah;
        } else {
            totalHarga = totalHarga;
        }
        System.out.println(toFixed(totalHarga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
