package ro.ctrln;

import java.util.Objects;

public class Planet {
    private String planetName;
    private int numberOfOceans;
    private double mass;
    private short numberOfMoons;

    public Planet() {}

    public Planet(String planetName, int numberOfOceans, double mass, short numberOfMoons) {
        super(); //refera clasa parinte, pot chema constructorul clasei parinte
        this.planetName = planetName;
        this.numberOfOceans = numberOfOceans;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }

    public String getPlanetName() {
        return this.planetName;
    }

    public int getNumberOfOceans() {
        return this.numberOfOceans;
    }

    public double getMass() {
        return this.mass;
    }

    public double getNumberOfMoons() {
        return  this.numberOfMoons;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setNumberOfOceans(int numberOfOceans) {
        this.numberOfOceans = numberOfOceans;
    }

    public void setMass (double mass) {
        this.mass = mass;
    }

    public void setNumberOfMoons (short numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planetName='" + planetName + '\'' +
                ", numberOfOceans=" + numberOfOceans +
                ", mass=" + mass +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return numberOfOceans == planet.numberOfOceans && Double.compare(planet.mass, mass) == 0 && numberOfMoons == planet.numberOfMoons && planetName.equals(planet.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName, numberOfOceans, mass, numberOfMoons);
    }

    public double computeMass(int powerOfTen) {
        return this.mass * Math.pow(10, powerOfTen);
    }
}


