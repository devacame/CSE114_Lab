package Lab20;

import java.util.ArrayList;

public class AnimalShelter {
    private ArrayList<Dog> dogs = new ArrayList<Dog>();
    private ArrayList<Cat> cats = new ArrayList<Cat>();

    public void addPet(Animal pet) {
        if (pet instanceof Dog) {
            for (int i = 0; i < dogs.size(); i++) {
                if (dogs.get(i).getYear() > pet.getYear()) {
                    dogs.add(i, (Dog) pet);
                    return;
                }
            }
            dogs.add((Dog) pet);
        } else if (pet instanceof Cat) {
            for (int i = 0; i < cats.size(); i++) {
                if (cats.get(i).getYearsAtShelter() < pet.getYearsAtShelter()) {
                    cats.add(i, (Cat) pet);
                    return;
                }
            }
            cats.add((Cat) pet);
        }
    }

    public Dog adoptPuppy() {
        Dog adopted = null;
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getYear() <= 1) {
                adopted = dogs.get(i);
                dogs.remove(i);
                return adopted;
            }
        }
        return null;
    }

    public Cat adoptLongestResidentCat() {
        if (!cats.isEmpty()) {
            Cat adopted = cats.get(0);
            cats.remove(0);
            return adopted;
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        Dog dog1 = new Dog("Bob", 1, 3);

        Dog dog2 = new Dog("Toby", 0.8, 0.5);

        Dog dog3 = new Dog("Lola", 5, 8);

        Dog dog4 = new Dog("Ruby", 0.4, 0.3);

        Cat cat1 = new Cat("Lucky", 7, 6.5);

        Cat cat2 = new Cat("Ginger", 11, 10);

        Cat cat3 = new Cat("Bella", 2, 4);

        shelter.addPet(dog1);

        shelter.addPet(dog2);

        shelter.addPet(dog3);

        shelter.addPet(cat1);

        shelter.addPet(cat2);

        shelter.addPet(cat3);

        shelter.addPet(dog4);

        System.out.println(shelter.dogs);
        System.out.println(shelter.cats);

        System.out.println(shelter.adoptLongestResidentCat());

        // Ginger: 11 years old, 10 years at the shelter

        System.out.println(shelter.adoptPuppy());

        // Ruby: 0.4 years old, 0.3 years at the shelter

        System.out.println(shelter.adoptPuppy());

        // Toby: 0.8 years old, 0.5 years at the shelter

        System.out.println(shelter.adoptPuppy());

        // Bob: 1 years old, 3 years at the shelter

        System.out.println(shelter.adoptPuppy());

        // null

        System.out.println(shelter.adoptLongestResidentCat());
        // Lucky: 7 years old, 6.5 years at the shelter
    }
}

class Animal {
    private String name;
    private double year, yearsAtShelter;

    public Animal(String name, double year, double yearsAtShelter) {
        this.name = name;
        this.year = year;
        this.yearsAtShelter = yearsAtShelter;
    }

    public String getName() {
        return name;
    }

    public double getYear() {
        return year;
    }

    public double getYearsAtShelter() {
        return yearsAtShelter;
    }

    public String toString() {
        return name + ": " + year + " years old, " + yearsAtShelter + " years at the shelter";
    }
}