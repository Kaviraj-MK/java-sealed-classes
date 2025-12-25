package org.example.sealed.model.finance;

/**
 * 2nd type of classes that sealed classes are allowed to extend themselves. These sealed classes can have their own
 * subclasses too. [In this case it's "DomesticTransfer", "InternationalTransfer"]
 * */
public sealed class BankTransfer extends PaymentMethod permits DomesticTransfer, InternationalTransfer {

    protected final String bankCode;

    protected BankTransfer (String id, String displayName, String bankCode) {
        super(id, displayName);
        this.bankCode = bankCode;
    }

    public String getBankCode() {
        return bankCode;
    }
}
