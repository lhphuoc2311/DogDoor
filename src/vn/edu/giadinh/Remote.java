package vn.edu.giadinh;

public class Remote {
    DogDoor door;

    public Remote(DogDoor door){
        this.door = door;
    }

    public void pressButton(){
        if(door.isOpen()){
            door.close();
        }else{
            door.open();
        }
    }
    
}
