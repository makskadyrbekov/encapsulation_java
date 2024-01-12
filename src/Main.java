import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        animal fish = new animal();
        fish.setType(" Balyk");
        fish.setCountry("Japan");
        fish.setYear(2012);
        fish.setNikName("Altyn Balyk");
        fish.setAction("Swim");
        fish.setWeight(1);


        animal popo = new animal();
        popo.setType("Попугай");
        popo.setNikName("POPO");
        popo.setWeight(2);
        popo.setCountry("Brazil");
        popo.setAction("Singing");
        popo.setYear(2016);


        animal cat = new animal();
        cat.setType("Cat");
        cat.setNikName("Muiza");
        cat.setWeight(2);
        cat.setCountry("Turkey");
        cat.setAction("Sleeping");
        cat.setYear(2019);


        animal dog = new animal();
        dog.setType("Dog");
        dog.setNikName("AK TOSH");
        dog.setWeight(8);
        dog.setCountry("KYRGYZSTAN");
        dog.setAction("Barking");
        dog.setYear(2022);


        System.out.println("-----------FISH INFORMATION-------------");
        System.out.println(fish);


       System.out.println("-----------ИНФО ПОПУГАЯ---------------");
        System.out.println(popo);


        System.out.println("-------------Cat INFORMATION----------------");
        System.out.println(cat);



        System.out.println("----------------Dog INFORMATION------------------");
        System.out.println(dog);









    }
}