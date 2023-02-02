package vehicles.water;

import products.IProduct;
import vehicles.Vehicle;

public final class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct) {
        super(weight, maxSpeed, baseProduct);
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String type) {
        this.hullType = type;
    }
}
