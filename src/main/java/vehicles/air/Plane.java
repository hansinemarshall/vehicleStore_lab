package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public final class Plane extends Vehicle implements IAirVehicles, IMotorised, IRadar {
    private int maxAltitude;
    private IMotorised engine;
    private boolean isEngineOn;
    private int maxRotorSpeed;
    private IRadar radar;


    public Plane(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine, IRadar radar) {
        super(weight, maxSpeed, baseProduct);
        this.maxAltitude = maxAltitude;
        this.engine = engine;
        this.isEngineOn = false;
        this.maxRotorSpeed = maxRotorSpeed;
        this.radar = radar;

    }

    @Override
    public int getMaxAltitude() {
        return maxAltitude;
    }

    @Override
    public void setMaxAltitude(int altitude) {
        this.maxAltitude = altitude;

    }

    @Override
    public int getMaxRotorSpeed() {
        return maxRotorSpeed;
    }

    @Override
    public void setMaxRotorSpeed(int speed) {
        this.maxRotorSpeed = speed;

    }

    @Override
    public void turnOn() {
        this.isEngineOn = true;

    }

    @Override
    public void turnOff() {
        this.isEngineOn = false;

    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void startEngine() {
        engine.startEngine();

    }

    @Override
    public void stopEngine() {
        engine.stopEngine();

    }

    @Override
    public int getHp() {
        return engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setActive(boolean active) {
        this.radar.setActive(active);
    }

    @Override
    public int getRange() {
        return radar.getRange();
    }

    @Override
    public void setRange(int range) {
        this.radar.setRange(range);
    }

    @Override
    public void start() {
        this.radar.start();
    }

    @Override
    public void stop() {
        this.radar.stop();
    }
}
