package vn.edu.giadinh;

public class DogDoor {
    private boolean open;//true - open - false: close

    public DogDoor(){
        open = false;
    }
    
    //TODO: update close automatically door @
    public void open(){
        System.out.println("The dog door open");
        open = true;
    }

    public void close(){
        System.out.println("The dog dor close");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
    
}
