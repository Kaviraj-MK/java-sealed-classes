package org.example.sealed.model.finance;

import java.math.BigDecimal;

public final class InternationalTransfer extends BankTransfer {
    private final String swiftCode;
    public InternationalTransfer(String id, String swiftCode) {
        super (id, "International Bank Transfer", swiftCode);
        this.swiftCode = swiftCode;
    }
    @Override
    public boolean processPayment(BigDecimal amount) {
        System.out.println("Processing International Transfer $" + amount + "via SWIFT: " + swiftCode);
        return true;
    }
}
