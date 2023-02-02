package vehicles.air;

public class Radar implements IRadar {
    private boolean isActive;
    private int range;


public Radar(int range) {
    this.range = range;
    this.isActive = false;

}

public boolean isActive(){
return isActive;
}

public void setActive(boolean active){
    isActive = active;
}

public int getRange(){
    return range;
}

public void setRange(int range){
    this.range = range;
}

public void start(){
this.isActive = true;
}

public void stop(){
this.isActive = false;
}

}





