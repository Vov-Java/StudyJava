public class Keyboard {
    private final String typeKeyboard;
    private final boolean backlight;
    private final int weightKeyboard;

    public Keyboard(String typeKeyboard, boolean backlight, int weightKeyboard) {
        this.typeKeyboard = typeKeyboard;
        this.backlight = backlight;
        this.weightKeyboard = weightKeyboard;
    }

    public String getTypeKeyboard() {
        return typeKeyboard;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public int getWeightKeyboard() {
        return weightKeyboard;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "typeKeyboard='" + typeKeyboard + '\'' +
                ", backlight=" + backlight +
                ", weightKeyboard=" + weightKeyboard +
                '}';
    }
}
