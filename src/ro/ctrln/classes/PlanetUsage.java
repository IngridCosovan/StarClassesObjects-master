package ro.ctrln.classes;

import ro.ctrln.Planet;

public class PlanetUsage {
    public static void main(String[] args) {
        Planet mercury = new Planet();
        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfMoons());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());

        mercury.setPlanetName("Mercur");
        mercury.setNumberOfMoons((short) 3);
        mercury.setNumberOfOceans(5);
        mercury.setMass(330);

        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfMoons());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());

        System.out.println(mercury);

        Planet venus = new Planet("Venus", 4, 488, (short) 20);
        System.out.println(venus);

        System.out.println("Mercury hashcode: " + mercury.hashCode());
        System.out.println("Venus hashcode: " + venus.hashCode());

//        mercury.setPlanetName(venus.getPlanetName());
//        mercury.setMass(venus.getMass());
//        mercury.setNumberOfOceans(venus.getNumberOfOceans());
//        mercury.setNumberOfMoons((short) venus.getNumberOfMoons());

        System.out.println("mercury.equals(venus): " + mercury.equals(venus));

        System.out.println("Mercury mass: " + mercury.computeMass(22));
        System.out.println("Venus mass: " + venus.computeMass(22));
    }
}
