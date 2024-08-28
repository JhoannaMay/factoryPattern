package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice) {
                case 1: 
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepherd");
                    System.out.println("\nPet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    break;

                case 2: 
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    System.out.println("\nPet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                    break;

                default:
                    System.out.println("Invalid choice, please select again.");
                    continue;
            }

            System.out.println("Communication sound: "+ petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());
        }

        input.close();
    }
}