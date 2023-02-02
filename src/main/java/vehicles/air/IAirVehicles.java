package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicles extends IVehicle {
    int getMaxAltitude();
    void setMaxAltitude(int altitude);
    int getMaxRotorSpeed();
    void setMaxRotorSpeed(int speed);
     void turnOn();
     void turnOff();
     boolean isOn();
 }


