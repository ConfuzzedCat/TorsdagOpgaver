public class ChanceCard {
    private String text;
    private int expense;
    private int income;

    public ChanceCard(String text, int expense, int income) {
        this.text = text;
        this.income = income;
        this.expense = expense;
    }

    public String getText() {
        return text;
    }

    public int getIncome() {
        return income;
    }

    public int getCost() {
        return expense;
    }

    @Override
    public String toString() {
        return "Chance card: " + text;
    }
}
