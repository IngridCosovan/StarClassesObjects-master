package ro.ctrln.classes;

import java.math.BigDecimal;
import java.util.Objects;

//clasa este o schita/plan dupa care este creat un obiect.
//Clasa contine, definitia clasei, proprietatile, definitia constructorilor, definitia metodelor
//Un obiect este o intranta creata dintr-o clasa

public class Star {
    private String starDescription; //variabla de instanta
    private int diameter; //variabla de instanta
    private int satellites; //variabla de instanta
    private BigDecimal mass; //variabla de instanta
    private SmallPlanet smallPlanet; //variabla de instanta, au valori diferite pentru fiecare obiect


    public static final boolean MILKYWAYSTAR = true; //variabila de clasa, contine static, au aceeasi valoarea pentru toate obiectele
//asta este o constanta puplic static final, constantele se scriu toate UPCASE

    // constructorul este pentru a initializa obiectele. este o metoda speciala.
    public Star() {
    }

    public Star(String starDescription, int diameter, int satellites, BigDecimal mass) { //tot ce e intre () sunt parametrii
        this.starDescription = starDescription;
        this.diameter = diameter;
        this.satellites = satellites;
        this.mass = mass;
    }

    // Getterele returneaza valoarea atributului
    public String getStarDescription() {
        return starDescription;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getSatellites() {
        return satellites;
    }

    public BigDecimal getMass() {
        return mass;
    }


    //Setteri  seteaza sau updateaza valoarea
    public void setStarDescription(String starDescription) { //parametrii
        this.starDescription = starDescription;  //this se refera la proprietatea obiectului curent
    }

    public void setDiameter(int i) {
        this.diameter = diameter;
    }

    public void setSatellites(int satellites) { //()parametrii
        this.satellites = satellites;
    }

    public void setMass(BigDecimal mass) { //() parametrii
        this.mass = mass;
    }

    public void setSmallPlanet(SmallPlanet smallPlanet /*parametrul metodei*/) {
        this.smallPlanet /* variabila de instanta*/ = smallPlanet; //parametrul metodei
        //this se refera la instanta curenta, la obiectul curent primeste valoarea parametrului smallPlanet,
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return diameter == star.diameter && satellites == star.satellites && starDescription.equals(star.starDescription) && mass.equals(star.mass) && smallPlanet.equals(star.smallPlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starDescription, diameter, satellites, mass, smallPlanet);
    }

    @Override
    public String toString() {
        return "Star{" +
                "starDescription='" + starDescription + '\'' +
                ", diameter=" + diameter +
                ", satellites=" + satellites +
                ", mass=" + mass +
                ", smallPlanet=" + smallPlanet +
                '}';
    }

    public SmallPlanet getSmallPlanet() { //getterle pot sa nu primeasca parametrii
        return this.smallPlanet; //variabila de instanta


    }


}

//variabile locale - variabilele exista doar in metoda executata sau in structuri de constrol for, while, do-while sau switch
//parametrii- se gasesc in constructori sau metide, sunt folositi pentru a transmite valori in interiorul unei metode sau al unui obiect.

