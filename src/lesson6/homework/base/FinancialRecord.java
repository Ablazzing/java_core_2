package lesson6.homework.base;

public class FinancialRecord {
    private int incomes;
    private int outcomes;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    public String getInfo() {
        return "доходы = " + this.incomes + ", расходы равно = "
                + this.outcomes;
    }

    public String serialize() {
        return this.incomes + ";" + this.outcomes + "\n";
    }
}
