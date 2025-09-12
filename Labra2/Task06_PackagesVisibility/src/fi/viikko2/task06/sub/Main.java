/**
 * Tehtävä 6 – Main (näkyvyysdemo)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Vehicle ja SportsCar.
 *  2. Tulosta ne.
 *  3. Kokeile kommentoituna mileage-käyttöä (pitää antaa virhe).
 *
 * VINKIT:
 *  - Kirjoita selittävä kommentti näkyvyydestä.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task06.sub;

import fi.viikko2.task06.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 6: implementoi Vehicle ja SportsCar, huomioi näkyvyydet.");
        Vehicle v = new Vehicle("Generic", 10000);
        SportsCar sc = new SportsCar("FastBrand", 450);
        System.out.println(v);
        System.out.println(sc);
        // sc.mileage = 500;   // EI KÄÄNNY: mileage on package-private eri paketissa
        // v.mileage = 12000;  // EI KÄÄNNY: sama syy
    }
}