package SolarSystem;

/**
 * Created by etenbrinke on 02/12/15.
 * a moon (also called a secondary planet) is a body of the Solar System
 */
public class Moon extends Planet {

    private String classification = "A Moon is a planet also called satellites, come in many shapes, sizes and types. They are generally solid bodies, and few have atmospheres.\n" +
                                    "A moon orbits around his natural satellite.";
    private SolarPlanet naturalSatellite;

    public Moon(String name, String color, boolean visibleFromEarth, boolean rings, double rotationPeriodRelativeToEarth, double diameterRelativeToEarth, double massRelativeToEarth, SolarPlanet naturalSatellite) {
        super(name, color, visibleFromEarth, rings, rotationPeriodRelativeToEarth, diameterRelativeToEarth, massRelativeToEarth);
        this.naturalSatellite = naturalSatellite;
    }

    public SolarPlanet getNaturalSatellite() {
        return naturalSatellite;
    }

    public String getNaturalSatelliteName() {
        return naturalSatellite.getName();
    }

    public void setNaturalSatellite(SolarPlanet naturalSatellite) {
        this.naturalSatellite = naturalSatellite;
    }

    @Override
    public String toString() {
        return "Moon: " + classification + "\n" +
               "naturalSatellite name=" + getNaturalSatelliteName() + ",\n" +
               super.toString();
    }
}
