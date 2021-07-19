package vn.edu.giadinh;

public class DogDoorTestDrive {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido bark to get out");
        System.out.println("Todd and Gina hear Fido bark");
        System.out.println("Todd and Gina press Remote");
        remote.pressButton();
        System.out.println("Fido get out");
        System.out.println("Todd and Gina press Remote");
        System.out.println("Do his business");
        System.out.println("Done");
        System.out.println("Fido bark to get in");

        
    }
    
}
