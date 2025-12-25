package org.example.sealed.model.finance;

public class PayPalBusiness extends PayPal {
    private final String businessId;

    public PayPalBusiness(String id, String email, String businessId) {
        super(id, email);
        this.businessId = businessId;
    }
}
