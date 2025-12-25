package org.example.sealed.model.finance;

import java.math.BigDecimal;
//1st type of class that sealed classes are allowed to extend by - Final classes. (Can't be extended anymore)
public final class CreditCard extends PaymentMethod {
    private final String creditCardNumber;
    private final String creditCardExpiry;

    public CreditCard(String id, String creditCardNumber, String creditCardExpiry) {
        super(id, "CreditCard");
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiry = creditCardExpiry;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCreditCardExpiry() {
        return creditCardExpiry;
    }

    @Override
    public boolean processPayment(BigDecimal amount) {
        System.out.println("Processing $" + amount + " payment of CreditCard");
        return true;
    }
}
