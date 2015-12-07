package SolarSystem;

/**
 * Created by etenbrinke on 02/12/15.
 * a star is a body of the Solar System
 */
public class Star extends SolarSystem {

    private String name, color;
    private boolean visibleFromEarth;

    public Star(String name, String color, boolean visibleFromEarth) {
        this.name = name;
        this.color = color;
        this.visibleFromEarth = visibleFromEarth;
    }
}
