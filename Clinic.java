import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet = null; // so that hopefully it fixes the problem with instanceof

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.println("[Exit] Pastores, Jabez Villan C.");
                    System.exit(0);
                    // Quit
            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: "+ petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());

            // If Cat getNoOfLives, if Dog getBreed
            if (pet instanceof Cat) {
                System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
            }
            else if (pet instanceof Dog) {
                System.out.println("Breed of Dog: " + ((Dog) pet).getBreed());
            }
            else if (pet == null) {
                System.out.println("Pet is null..."); // For debugging
            }



        }

    }
}