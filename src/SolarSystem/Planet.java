package SolarSystem;

/**
 * Created by etenbrinke on 02/12/15.
 * a planet is a body of the Solar System
 */
abstract public class Planet extends SolarSystem {

    private String classification = "A Planet is an astronomical object orbiting a star or stellar remnant that:\n" +
            "- is massive enough to be rounded by its own gravity,\n" +
            "- is not massive enough to cause thermonuclear fusion, and\n" +
            "- has cleared its neighbouring region of planetesimals";
    private String name, color;
    private boolean visibleFromEarth, rings;
    private double rotationPeriodRelativeToEarth, diameterRelativeToEarth, massRelativeToEarth;

    public Planet(String name, String color, boolean visibleFromEarth, boolean rings, double rotationPeriodRelativeToEarth, double diameterRelativeToEarth, double massRelativeToEarth) {
        this.name = name;
        this.color = color;
        this.visibleFromEarth = visibleFromEarth;
        this.rings = rings;
        this.rotationPeriodRelativeToEarth = rotationPeriodRelativeToEarth;
        this.diameterRelativeToEarth = diameterRelativeToEarth;
        this.massRelativeToEarth = massRelativeToEarth;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisibleFromEarth() {
        return visibleFromEarth;
    }

    public void setVisibleFromEarth(boolean visibleFromEarth) {
        this.visibleFromEarth = visibleFromEarth;
    }

    public boolean isRings() {
        return rings;
    }

    public void setRings(boolean rings) {
        this.rings = rings;
    }

    public double getRotationPeriodRelativeToEarth() {
        return rotationPeriodRelativeToEarth;
    }

    public void setRotationPeriodRelativeToEarth(double rotationPeriodRelativeToEarth) {
        this.rotationPeriodRelativeToEarth = rotationPeriodRelativeToEarth;
    }

    public double getDiameterRelativeToEarth() {
        return diameterRelativeToEarth;
    }

    public void setDiameterRelativeToEarth(double diameterRelativeToEarth) {
        this.diameterRelativeToEarth = diameterRelativeToEarth;
    }

    public double getMassRelativeToEarth() {
        return massRelativeToEarth;
    }

    public void setMassRelativeToEarth(double massRelativeToEarth) {
        this.massRelativeToEarth = massRelativeToEarth;
    }

    public void flyAboveSurface () {
        System.out.println("Flying above the " + getColor() + " surface of " + getName());
    }

    public void flyAbovePlanet (Planet p) {
        System.out.println("Flying above planet " + p.getName());
    }

    @Override
    public String toString() {
        return "Planet: " + classification + "\n" +
               "name=" + name + ",\n" +
               "color=" + color + ",\n" +
               "visibleFromEarth=" + visibleFromEarth + ",\n" +
               "rings=" + rings + ",\n" +
               "rotationPeriod=" + rotationPeriodRelativeToEarth + ",\n" +
               "diameterRelativeToEarth=" + diameterRelativeToEarth + ",\n" +
               "massRelativeToEarth=" + massRelativeToEarth;
    }
}

