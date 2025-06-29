public class Processor {
    private final int frequency;
    private final int countCore;
    private final String manufacturer;
    private final int processorWeight;

    public Processor(int frequency, int countCore, String manufacturer, int processorWeight) {
        this.frequency = frequency;
        this.countCore = countCore;
        this.manufacturer = manufacturer;
        this.processorWeight = processorWeight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCountCore() {
        return countCore;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProcessorWeight() {
        return processorWeight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", countCore=" + countCore +
                ", manufacturer='" + manufacturer + '\'' +
                ", processorWeight=" + processorWeight +
                '}';
    }
}
