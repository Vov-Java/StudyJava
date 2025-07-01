public class Screen {
    private final int diagonal;
    private final ScreanPanelType screenType;
    private final int screenWeight;

    public Screen(int diagonal, ScreanPanelType screenType, int screenWeight) {
        this.diagonal = diagonal;
        this.screenType = screenType;
        this.screenWeight = screenWeight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public ScreanPanelType getScreenType() {
        return screenType;
    }

    public int getScreenWeight() {
        return screenWeight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "diagonal=" + diagonal +
                ", screenType='" + screenType + '\'' +
                ", screenWeight=" + screenWeight +
                '}';
    }
}
