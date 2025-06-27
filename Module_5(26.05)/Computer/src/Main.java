public class Main {
    public static void main(String[] args) {
        Computer ps = new Computer("hv","ghv",
                new Processor(43,3,"amd",150),
                new RandomAccessMemory("hfber",500,300),
                new Storage("fbhf",3,600,TypeStorage.HDD),
                new Screen(32,"fj",3,ScreanPanelType.VA),
                new Keyboard("ttttt",true,500));

    }
}
