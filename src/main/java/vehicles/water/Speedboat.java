package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Motor;
import vehicles.Vehicle;

public final class Speedboat extends Vehicle implements IWaterVehicle, IMotorised, IProduct{

    private IMotorised motor;

    private String hullType;


    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor){
        super(weight, maxSpeed,baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }


    @Override
    public float getPrice() {
        return this.baseProduct.getPrice();
    }

    @Override
    public long getInventory() {
        return this.baseProduct.getInventory();
    }

    @Override
    public void setPrice(float price) {
        baseProduct.setPrice(price);
    }

    @Override
    public void setInventory(long amount) {
        baseProduct.setInventory(amount);
    }

    @Override
    public void setTitle(String title) {
        baseProduct.setTitle(title);
    }

    @Override
    public String getTitle() {
        return baseProduct.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) throws Exception {
        baseProduct.removeInventory(amount);
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }

    @Override
    public void setMaxSpeed(int speed) {
        super.setMaxSpeed(speed);
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String type) {
        this.hullType = type;

    }

    @Override
    public void startEngine() {
        motor.startEngine();

    }

    @Override
    public void stopEngine() {
        motor.stopEngine();

    }

    @Override
    public int getHp() {
        return motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        motor.setHp(hp);

    }

    @Override
    public int getFuel() {
        return motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        motor.setFuel(fuel);

    }
}
