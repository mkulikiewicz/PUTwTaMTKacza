public class Money {
    private int amount;
    private String currency;

//    public Money(int amount, String currency) {
//        this.amount = amount;
//        this.currency = currency;
//    }

    public Money(int amount, String currency) { if (amount < 0) {
        throw new IllegalArgumentException( "illegal negative amount: [" + amount + "]"); }
        if (currency == null || currency.isEmpty()) { throw new IllegalArgumentException( "illegal currency: [" + currency + "], it can not be null or empty");
        }
        this.amount = amount; this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money money = (Money) obj;
            return money.getCurrency().equals(getCurrency()) && getAmount() == money.getAmount();
        }
        return false;
    }


}
