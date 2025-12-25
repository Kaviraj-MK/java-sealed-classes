package org.example.sealed.model.finance;

import java.math.BigDecimal;

//Sealed class declaration
public sealed class PaymentMethod permits BankTransfer, CreditCard, PayPal {
    protected final String id;
    protected final String displayName;

    protected PaymentMethod(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Abstract method that subclasses must implement
     */
    public boolean processPayment(BigDecimal amount) {
        return false;
    }

}
