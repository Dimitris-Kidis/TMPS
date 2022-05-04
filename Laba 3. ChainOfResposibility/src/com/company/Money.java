package com.company;

public class Money {
    private int amt;

    public Money(int amt) {
        setAmt(amt);
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        if ( amt > 0 && amt <= 100_000 ) {
            this.amt = amt;
        } else {
            throw new RuntimeException("Сумма денег должна быть не меньше 0 и не больше 100.000\n");
        }
    }
}
