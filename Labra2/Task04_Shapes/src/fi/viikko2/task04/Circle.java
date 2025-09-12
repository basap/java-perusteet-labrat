/**
 * Tehtävä 4 – Circle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kenttä radius.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Area = Math.PI * r * r.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

import java.util.Objects;

public class Circle extends Shape {
    private Double radius;

    public Circle(String name, Double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public Double area() {
        if (radius == null || radius <= 0) {
            return 0.0;
        }
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){ 
        return "Circle: " + Math.PI + " x " + radius + " x " + radius + " = " + area();
    }

    @Override
    public boolean equals(Object o){ 
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle other = (Circle) o;
        return Objects.equals(this.radius, other.radius);
    }
}