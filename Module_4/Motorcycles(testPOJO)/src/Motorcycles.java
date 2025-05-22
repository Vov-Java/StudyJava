public class Motorcycles {
    private String motoBrand;
    private int motoPrice;
    private int enginePower; // лошадиные силы
    private int maxSpeed;
    private double fuelTankVolume; // литры

    public Motorcycles(String motoBrand,int motoPrice){
        this.motoBrand = motoBrand;
        this.motoPrice = motoPrice;
    }
    public String getMotoBrand(){
        return motoBrand;
    }
    public int getMotoPrice(){
        return motoPrice;
    }
    public int getEnginePower(){
        return enginePower;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public double getFuelTankVolume(){
        return fuelTankVolume;
    }
    public void setMotoBrand(String motoBrand){
        this.motoBrand = motoBrand;
    }
    public void setMotoPrice(int motoPrice){
        this.motoPrice = motoPrice;
    }
    public void setEnginePower(int enginePower){
        this.enginePower = enginePower;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setFuelTankVolume(double fuelTankVolume){
        this.fuelTankVolume = fuelTankVolume;
    }
}
