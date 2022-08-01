package lesson7;

//Справочник стран аналог enum
public class Country2 {
    public final static Country2 RUSSIA = new Country2(140_000_000L);
    public final static Country2 RF = new Country2(140_000_000L);
    private long countPeople;

    private Country2(long countPeople) {
        this.countPeople = countPeople;
    }

    public long getCountPeople() {
        return countPeople;
    }

}
