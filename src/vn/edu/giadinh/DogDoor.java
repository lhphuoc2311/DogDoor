package vn.edu.giadinh;

public class DogDoor {
    private boolean open;

    public DogDoor(){
        open = false;
    }
    
    //TODO: update close automatically door @
    public void open(){
        System.out.println("Open the door");
        open = true;
    }

    public void close(){
        System.out.println("Close the door");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
    
}
