package org.example.sealed.model.finance;

import java.math.BigDecimal;

//3rd method. non sealed classes. These calsses are open fo extensions.
public non-sealed class PayPal extends PaymentMethod {
    private String email;

    public PayPal(String id, String email) {
        super(id, "PayPal");
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean processPayment(BigDecimal amount) {
        System.out.println("Processing $" + amount + "via Paypal: " + email);
        return true;
    }

}
