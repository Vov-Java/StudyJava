public class Main {
    public static void main(String[] args) {
        Computer ps = new Computer("hv","ghv",
                new Processor(43,3,"amd",150),
                new RandomAccessMemory("hfber",500,300),
                new Storage(TypeStorage.HDD,2,300),
                new Screen(34, ScreanPanelType.VA,200),
                new Keyboard("ttttt",true,500));

        System.out.println(ps.toString());
    }
}
