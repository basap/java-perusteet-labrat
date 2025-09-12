/**
 * Tehtävä 4 – Shape-hierarkia (perintä)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perusluokka, jossa area() palauttaa 0.0.
 *  2. toString() voi palauttaa "Shape".
 *
 * VINKIT:
 *  - Aliluokissa Rectangle/Circle tehdään varsinainen logiikka.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Double area() {
        return 0.0;
    }

    public String toString() {
        return name;
    }
}