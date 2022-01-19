package ro.ctrln;

import ro.ctrln.classes.SmallPlanet;
import ro.ctrln.classes.Star;

import java.math.BigDecimal;

public class StarUsage {
    public static void main(String[] args) {
        Star star = new Star();
        //obiectul=numele clasei/tipul de data folosit, dupa numele variabilei care va primi valoarea new si invocam constructoul.
    star.setStarDescription("Aceasta este steaua Kepler!");
    star.setDiameter(1000);
    star.setSatellites(15);
    star.setMass(new BigDecimal(2500));
    star.setSmallPlanet(new SmallPlanet("Star Planet Name"));

        System.out.println("Obiectul star " + star);

        Star mars = new Star("Aceasta este steaua Mars!", 2000, 20,new BigDecimal(5000));
        mars.setSmallPlanet(new SmallPlanet("Mars Planet"));

        System.out.println("Obiectul mars " + mars);

        SmallPlanet starPlanet = new SmallPlanet();
        starPlanet.setPlanetName("Numele Planetei din jurul stelei!");

        SmallPlanet marsPlanet = new SmallPlanet();
        marsPlanet.setPlanetName("Numele Planetei din jurul lui Marte!");

        star.setSmallPlanet(starPlanet);
        mars.setSmallPlanet(marsPlanet);

        System.out.println(starPlanet.computeSmallPlanetLocation(star, 20));
        System.out.println(marsPlanet.computeSmallPlanetLocation(mars, 30));
    }
}
