package ro.ctrln.classes;

import java.util.Objects;

public class SmallPlanet {
    private String planetName;

    public SmallPlanet(String planetName) {
        this.planetName = planetName;
    }

    public SmallPlanet() {
    }


    public String getPlanetName() {
        return this.planetName;
    }
    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String computeSmallPlanetLocation(Star star, int location) {  //metoda, smallPlanet este parametrul
        return star.getStarDescription() + this.planetName + location;

        //location este o variabila locala, va "trai" cat va fi apelata metoda computeSmallPlanetLocation
        //intr-o metoda ne putem folosi de proprietatile clasei/variabilele de instanta, de parametrii si valorile parametrilor
        //si ne putem defini si alte variabile locale
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallPlanet that = (SmallPlanet) o;
        return planetName.equals(that.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName);
    }

    @Override
    public String toString() {
        return "SmallPlanet{" +
                "planetName='" + planetName + '\'' +
                '}';
    }
}
