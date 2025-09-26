import java.util.Scanner;

public class Labra3Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nSyötä tehtävän numero (esim. L1, L2 jne. ) tai 'stop': ");
            String valinta = sc.nextLine();

            if (valinta.equalsIgnoreCase("stop")) {
                break;
            }

            switch (valinta.toUpperCase()) {
                case "L1" -> Labra3.tehtl1(args);
                case "L2" -> Labra3.tehtl2(args);
                case "L3" -> Labra3.tehtl3(args);
                case "L4" -> Labra3.tehtl4(args);
                case "L5" -> Labra3.tehtl5(args);
                case "L6" -> Labra3.tehtl6(args);
                case "S1" -> Labra3.tehts1(args);
                case "S2" -> Labra3.tehts2(args);
                case "S3" -> Labra3.tehts3(args);
                case "M1" -> Labra3.tehtm1(args);
                case "M2" -> Labra3.tehtm2(args);
                case "M3" -> Labra3.tehtm3(args);
                case "C1" -> Labra3.tehtc1(args);
                case "C2" -> Labra3.tehtc2(args);
                case "C3" -> Labra3.tehtc3(args);
                case "C4" -> Labra3.tehtc4(args);
                case "A1" -> Labra3.tehta1(args);
                case "A2" -> Labra3.tehta2(args);
                case "A3" -> Labra3.tehta3(args);
                default -> System.out.println("tuntematon tehtävä");
            }
        }

        sc.close();
    }
}
