package SolarSystem;

/**
 * Created by etenbrinke on 02/12/15.
 * good reading for upcasting and downcasting : http://forum.codecall.net/topic/50451-upcasting-downcasting/
 */
public class TestSolarSystem {

    public static void main(String[] args) {

        // earth
        TerrestrialPlanet earth = new TerrestrialPlanet("Earth","Beautiful colors",true,false,1,1,1,1,"Rocky",true);
        System.out.println(earth.toString() + "\n");

        // our moon
        Moon earth_moon = new Moon("Moon","gray",true,false,32326054,0.27,0.012,earth);
        System.out.println(earth_moon.toString() + "\n");

        // mars
        TerrestrialPlanet mars = new TerrestrialPlanet("Mars","brown/red",true,false,1.03,0.532,0.11,2,"rocky",true);
        mars.flyAboveSurface();
        mars.LandOnSurface();
        System.out.println(mars.toString() + "\n");

        // jupiter
        SolarPlanet jupiter = new SolarPlanet("Jupiter","rich colors",true,true,0.41,11.209,317.8,67);
        jupiter.flyAboveSurface();
        System.out.println("Mass relative to our earth: " + jupiter.getMassRelativeToEarth());

        // upcast TerrestrialPlanet to SolarPlanet
        SolarPlanet m1 = mars;
        m1.flyAboveSurface();
        // method lost by upcast, not possible m1.LandOnSurface();
        System.out.println(m1.toString() + "\n");

        // automatic upcast TerrestrialPlanet to SolarPlanet
        SolarPlanet m2 = new TerrestrialPlanet("Mars","brown/red",true,false,1.03,0.532,0.11,2,"rocky",true);
        m2.flyAboveSurface();
        // method not possible : m2.LandOnSurface();
        System.out.println(m2.toString() + "\n");

        // downcasting must always done manually
        // manual downcast SolarPlanet to TerrestrialPlanet
        TerrestrialPlanet m3 = (TerrestrialPlanet) m2;
        // method possible again
        m3.LandOnSurface();
        System.out.println(m3.toString() + "\n");

        // downcast not possible, Jupiter is no Terrestrial Planet, this will create a java.lang.ClassCastException error at run-time
        //TerrestrialPlanet m4 = (TerrestrialPlanet) jupiter;

        // program a safe cast
        if (mars instanceof SolarPlanet) {
            SolarPlanet solarPlanet = (SolarPlanet) mars;
            System.out.println("You can cast mars to a SolarPlanet safely");
        } else {
            System.out.println("You can't cast mars to a SolarPlanet safely");
        }
        // output "You can cast mars to a SolarPlanet safely"

        if (jupiter instanceof TerrestrialPlanet) {
            TerrestrialPlanet terrestrialPlanet = (TerrestrialPlanet) jupiter;
            System.out.println("You can cast jupiter to a TerrestrialPlanet safely");
        } else {
            System.out.println("You can't cast jupiter to a TerrestrialPlanet");
        }
        // output "You can't cast jupiter to a TerrestrialPlanet"

        // automatic upcast to Planet
        Observe.Watch(mars);
        Observe.Watch(jupiter);
        Observe.Watch(earth_moon);

        // Dynamic method lookup, polymorphism
        // automatic upcast to Planet
        // output "Flying above planet Mars"
        mars.flyAbovePlanet(mars);
        jupiter.flyAbovePlanet(mars);
        // output "Flying above planet Jupiter"
        mars.flyAbovePlanet(jupiter);
        jupiter.flyAbovePlanet(jupiter);

        // polymorphism
        // flyMoreAbovePlanet method of Planet AND SolarPlanet
        mars.flyMoreAbovePlanet(mars);
        jupiter.flyMoreAbovePlanet(mars);
        mars.flyMoreAbovePlanet(jupiter);
        jupiter.flyMoreAbovePlanet(jupiter);
        // output:
        // Flying more above planet Mars (method in TerrestrialPlanet)
        // Flying more above planet Mars (method in SolarPlanet)
        // Flying more above planet Jupiter (method in SolarPlanet)
        // Flying more above planet Jupiter (method in SolarPlanet)

        // automatic upcast to SolarPlanet
        mars.WatchSolarPlanetWithTelescope(mars);
        // Moon can not be converted to SolarPlanet by method invocation conversion
        // mars.WatchSolarPlanetWithTelescope(earth_moon);

    }

}
