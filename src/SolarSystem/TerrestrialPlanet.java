package SolarSystem;

/**
 * Created by etenbrinke on 02/12/15.
 */
public class TerrestrialPlanet extends SolarPlanet {

    private String bodyComposition;
    private boolean possibleToLandOnSurface;

    public TerrestrialPlanet(String name, String color, boolean visibleFromEarth, boolean rings, double rotationPeriodRelativeToEarth, double diameterRelativeToEarth, double massRelativeToEarth, int numberOfMoons, String bodyComposition, boolean possibleToLandOnSurface) {
        super(name, color, visibleFromEarth, rings, rotationPeriodRelativeToEarth, diameterRelativeToEarth, massRelativeToEarth, numberOfMoons);
        this.bodyComposition = bodyComposition;
        this.possibleToLandOnSurface = possibleToLandOnSurface;
    }

    public void LandOnSurface() {
        System.out.print("Landing on " + getColor() + " " + bodyComposition + " " + getName() + " surface ");
        if (possibleToLandOnSurface) {
            System.out.println("was successful");
        } else {
            System.out.println("failed");
        }

    }

    public void flyMoreAbovePlanet (TerrestrialPlanet p) {
        System.out.println("Flying more above planet " + p.getName() + " (method in TerrestrialPlanet)");
    }

}
