public class Computer {

    private final String vendor;
    private final String name;
    private TypeStorage typeStorage;
    private ScreanPanelType screanPanelType;
    private Processor processor;
    private RandomAccessMemory ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;
    public int totalWeidht;
    public String toString;

        public Computer(String vendor, String name, TypeStorage typeStorage, ScreanPanelType screanPanelType,
                Processor processor, RandomAccessMemory ram, Storage storage,
                        Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.typeStorage = typeStorage;
        this.screanPanelType = screanPanelType;
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

    public TypeStorage getTypeStorage() {
        return typeStorage;
    }

    public ScreanPanelType getScreanPanelType() {
        return screanPanelType;
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

    public void totalWeidht(){
            this.totalWeidht = ram.getWeightRam() + processor.getProcessorWeight() + storage.getStorageWeight() +
                    screen.getScreenWeight() + keyboard.getWeightKeyboard();
    }
}
