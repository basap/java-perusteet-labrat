/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

import java.util.Objects;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(String name, Double width, Double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area(){
        if (width == null || height == null || width <= 0 || height <= 0) {
            return 0.0;
        }
        return width * height;
    }

    @Override
    public String toString(){ 
        return "Rectangle: " + width + " x " + height + " = " + area();
    }

    @Override
    public boolean equals(Object o){ 
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) o;
        return Objects.equals(this.width, other.width) &&
               Objects.equals(this.height, other.height);
    }
}