/**
 * Tehtävä 1 – Person (luokat, kentät, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Lisää kentät: name (String) ja age (int) – pidä ne private.
 *  2. Toteuta konstruktorit: (name, age) ja (name) age=0.
 *  3. Toteuta `int birthday()` joka kasvattaa ikää ja palauttaa uuden iän.
 *  4. Ylikirjoita `toString()` ja `equals(Object)` (name + age).
 *
 * VINKIT:
 *  - Hyödynnä `java.util.Objects.equals(this.name, other.name)` equalsissa.
 *  - Käytä `@Override`-annotaatiota ylikirjoituksissa.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

public Person(String name) {
    this(name,0);
}

public int birthday() {
    return ++age;
}

@Override
public String toString() {
    return name + " " + age;
}

@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return age == other.age &&
               Objects.equals(name, other.name);
    }
}