package lesson7;

public class YachtWithCountry extends Boat {
    Country countryFrom;

    public YachtWithCountry(Country countryFrom) {
        this.countryFrom = countryFrom;
    }

    @Override
    public void swim() {
        System.out.println("Яхта плывет");
    }
}
