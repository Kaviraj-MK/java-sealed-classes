package org.example.sealed.model.finance;

import java.math.BigDecimal;

// This class should be final or one of other two types of class. (sealed, non-sealeds)
public final class DomesticTransfer extends BankTransfer{
    public DomesticTransfer(String id, String bankCode) {
        super(id, "Domestic Bank Transfer", bankCode);
    }

    @Override
    public boolean processPayment(BigDecimal amount) {
        System.out.println("Processing Domestic Transfer $" + amount);
        return true;
    }
}
