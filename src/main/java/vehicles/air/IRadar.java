package vehicles.air;

public interface IRadar {

    public boolean isActive();
    public void setActive(boolean active);
    public int getRange();
    public void setRange(int range);
    public void start();
    public void stop();
}
