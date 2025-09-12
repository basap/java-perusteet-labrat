/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {

    public static int sum(int a,int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int n : arr) {
            result += n;
        }
        return result;
    }

    public static double sum(double[] arr) {
        double result = 0;
        for (double n : arr) {
            result += n;
        }
        return result;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Taulukko on tyhjä");
        }
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }

    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Taulukko on tyhjä");
        }
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }
        return min;
    }
}