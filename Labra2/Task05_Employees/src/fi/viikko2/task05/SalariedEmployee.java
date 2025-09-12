/**
 * Tehtävä 5 – SalariedEmployee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perii Employee; kenttä monthlySalary.
 *  2. monthlyPay() palauttaa kuukausipalkan.
 *  3. toString() kuvaava.
 *
 * VINKIT:
 *  - Muista super(name).
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double monthlyPay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return name + " (SalariedEmployee, salary = " + monthlySalary + ")";
    }
}