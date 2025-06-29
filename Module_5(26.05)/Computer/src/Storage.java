public class Storage {
    private final String storageType;
    private final int volumeStorage;
    private final int storageWeight;
    public Storage(String storageType,int volumeStorage,int storageWeight,TypeStorage typeStorage){
        this.storageType = storageType;
        this.volumeStorage = volumeStorage;
        this.storageWeight = storageWeight;
    }
    public String getStorageType(){
        return storageType;
    }
    public int getVolumeStorage(){
        return volumeStorage;
    }
    public int getStorageWeight(){
        return storageWeight;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageType='" + storageType + '\'' +
                ", volumeStorage=" + volumeStorage +
                ", storageWeight=" + storageWeight +
                '}';
    }
}
