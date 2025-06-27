public class Computer {

    private final String vendor;
    private final String name;
    private Processor processor;
    private RandomAccessMemory ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;
    public int totalWeidht;

        public Computer(String vendor, String name,Processor processor, RandomAccessMemory ram, Storage storage,
                        Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RandomAccessMemory getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RandomAccessMemory ram) {
        this.ram = ram;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void totalWeidht(){
            this.totalWeidht = ram.getWeightRam() + processor.getProcessorWeight() + storage.getStorageWeight() +
                    screen.getScreenWeight() + keyboard.getWeightKeyboard();
    }
}
