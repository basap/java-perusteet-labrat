/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 5: implementoi SalariedEmployee ja HourlyEmployee ennen ajoa.");

        Employee[] employees = new Employee[] {
            new HourlyEmployee("Alice", 20.0, 160),
            new SalariedEmployee("Bob", 4000),
            new HourlyEmployee("Charlie", 15.5, 120),
            new SalariedEmployee("Diana", 3500)
        };

        double sum = 0.0;
        for (Employee e : employees) {
            System.out.println(e + ", Monthly Pay: " + e.monthlyPay());
            sum += e.monthlyPay();
        }
        System.out.println("\nTotal monthly payroll: " + sum);
        Employee e1 = new HourlyEmployee("Alice", 20.0, 160);
        System.out.println(employees[0].equals(e1));
    }
}