/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

import java.util.Objects;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance < 0) {
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }
    
    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}"; 
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount other = (BankAccount) o;
        return Objects.equals(this.accountNumber, other.accountNumber);
    }
}