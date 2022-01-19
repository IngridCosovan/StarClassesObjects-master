package ro.ctrln.vectors;

import java.util.Arrays;

public class Vectors {
    public static void main(String[] args) {

        char[] source = {'a' , 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] sourceOne = {'c' , 'a', 'b', 'd', 'e', 'f'};
        char[] sourceTwo = {'z' , 'w', 'b', 'a', 'v', 't'};
        char[] destination = new char[10];


        System.arraycopy(source, 2, destination, 0, 3); //metoda statica ajutatoare arrays
        System.out.println(destination);

        char [] copyOfRange = Arrays.copyOfRange(source, 0, 4);
        System.out.println(copyOfRange);

        char [] anotherCopyOfRange = Arrays.copyOfRange(source, 2, 6); //ia pozitia de start, insa fara pozitia de final
        System.out.println(anotherCopyOfRange);

        copyOfRange = Arrays.copyOfRange(source, 0, 20);
        System.out.println(copyOfRange);

//        copyOfRange = Arrays.copyOfRange(source, 15, 20);
//        System.out.println(copyOfRange);

        Arrays.fill(destination, 'c');  //metoda utilitara, adica e prin import java.util.Arrays
        System.out.println(destination); //umple cu val c tot vectorul

//        Arrays.binarySearch(source, 2);
//        System.out.println(source);

        System.out.println(Arrays.binarySearch(source,'z'));
        System.out.println(Arrays.binarySearch(source, 'b'));

        System.out.println(Arrays.binarySearch(sourceOne,'b'));
        System.out.println(Arrays.binarySearch(sourceTwo,'b'));
        System.out.println(Arrays.binarySearch(sourceTwo,'z'));
        //trebuie sa fie in ordine aceste caractere, sa fie sortat

        //astea sunt metode utilitare

    }
}
