/**
 * Tehtävä 3 – Main (testaa BankAccount)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo tilejä; testaa talletus/nosto ja equals.
 *
 * VINKIT:
 *  - Tulosta toString()-arvot helpottaaksesi tarkistusta.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("FI00 123", 100);
        BankAccount b = new BankAccount("FI00 999", -50);
        System.out.println(a.deposit(25));
        System.out.println(a.withdraw(140));
        System.out.println(a.withdraw(50));
        System.out.println(a);
        System.out.println(b.getBalance());
        BankAccount a2 = new BankAccount("FI00 123", 0);
        System.out.println(a.equals(a2));
    }
}