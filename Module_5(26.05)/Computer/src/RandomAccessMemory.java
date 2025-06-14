public class RandomAccessMemory {
    private final String ramType;
    private final int volumeRam;
    private final int weightRam;

    public RandomAccessMemory(String ramType,int volumeRam,int weightRam){
        this.ramType = ramType;
        this.volumeRam = volumeRam;
        this.weightRam = weightRam;
    }
    public String getRamType(){
        return ramType;
    }
    public int getVolumeRam(){
        return volumeRam;
    }
    public int getWeightRam(){
        return weightRam;
    }
}
