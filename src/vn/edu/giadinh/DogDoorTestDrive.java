package vn.edu.giadinh;

public class DogDoorTestDrive {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido barks to go outside ...");
        System.out.println("Todd and Gina hear Fido barking");
        remote.pressButton();
        System.out.println("\nFdio has gone outsite ...");
        System.out.println("\nFido done bussiness ...");

        //
        System.out.println("Fido chasing ...");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("... Fido is stuck outside");

        System.out.println("\n Fido start barking ...");
        System.err.println("\n...Todd and Gina get the remote control.");//bat tien
        remote.pressButton();
        System.out.println("\n Fido get inside");
        
    }
    
}
