package vn.edu.giadinh;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    DogDoor door;

    public Remote(DogDoor door){
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button ...");
        if(door.isOpen()){
            door.close();
        }else{
            door.open();

            System.out.println("waing for 5s ...");
            
            //after the door open
            //waiting for 5s ...
            // door close
            
            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run() {
                    door.close();
                }
            }, 5000);
        }
    }
    
}
