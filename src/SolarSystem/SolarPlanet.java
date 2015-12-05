package SolarSystem;

/**
 * Created by etenbrinke on 02/12/15.
 * a solar planet is a body of the Solar System
 */
public class SolarPlanet extends Planet {

    private String classification = "This planet is called a Solar planet because it clears its neighbourhood around its orbit.\n" +
                                    "Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune are classified as Solar planets.";
    private int numberOfMoons;

    public SolarPlanet(String name, String color, boolean visibleFromEarth, boolean rings, double rotationPeriodRelativeToEarth, double diameterRelativeToEarth, double massRelativeToEarth, int numberOfMoons) {
        super(name, color, visibleFromEarth, rings, rotationPeriodRelativeToEarth, diameterRelativeToEarth, massRelativeToEarth);
        this.numberOfMoons = numberOfMoons;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public void WatchSolarPlanetWithTelescope (SolarPlanet p) {
        System.out.println("Watching planet " + p.getName() + " by telescope");
    }

    public void flyMoreAbovePlanet (SolarPlanet p) {
        System.out.println("Flying more above planet " + p.getName() + " (method in SolarPlanet)");
    }

    @Override
    public String toString() {
        return "SolarPlanet: " + classification + "\n" +
               "numberOfMoons=" + numberOfMoons + ",\n" +
               super.toString();
    }
}
