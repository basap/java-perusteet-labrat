/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 4: implementoi Rectangle ja Circle ennen ajoa.");
        Rectangle r1 = new Rectangle("rectangle1", 5.0, 3.0);
        Rectangle r2 = new Rectangle("rectangle2", 5.0, 3.0);
        Rectangle r3 = new Rectangle("rectangle3", 2.0, 4.0);
        System.out.println(r1);
        System.out.println((r3));
        System.out.println(r1.equals(r2));
        Circle c = new Circle("circle", 2.0);
        System.out.println(c);
    }
}