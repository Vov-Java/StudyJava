public class Storage {
    private final TypeStorage storageType;
    private final int volumeStorage;
    private final int storageWeight;

    public Storage(TypeStorage storageType, int volumeStorage, int storageWeight) {
        this.storageType = storageType;
        this.volumeStorage = volumeStorage;
        this.storageWeight = storageWeight;
    }
    public TypeStorage getStorageType() {
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
