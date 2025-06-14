public class Screen {
    private final int diagonal;
    private final String screenType;
    private final int screenWeight;

    public Screen(int diagonal, String screenType, int screenWeight) {
        this.diagonal = diagonal;
        this.screenType = screenType;
        this.screenWeight = screenWeight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getScreenType() {
        return screenType;
    }

    public int getScreenWeight() {
        return screenWeight;
    }
}
