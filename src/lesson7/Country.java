package lesson7;

//Справочник стран
public enum Country {

    RUSSIA(140_000_000L),
    USA(350_000_000L),
    FRANCE(80_000_000L),
    JAPAN(200_000_000L);
    private long countPeople;

    Country(long countPeople) {
        this.countPeople = countPeople;
    }

    public long getCountPeople() {
        return this.countPeople;
    }

}
