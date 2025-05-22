public class Country {

    private String countryName;
    private  int populationSize;
    private int kilometersSquare;
    private String capitalName;
    private boolean seaExit;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public int getKilometersSquare() {
        return kilometersSquare;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public boolean isSeaExit() {
        return seaExit;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public void setKilometersSquare(int kilometersSquare) {
        this.kilometersSquare = kilometersSquare;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setSeaExit(boolean seaExit) {
        this.seaExit = seaExit;
    }
}
