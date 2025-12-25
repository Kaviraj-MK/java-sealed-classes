package org.example.sealed.model.finance;

import java.math.BigDecimal;

public class PaymentProcessor {
    public String getPaymentDescription(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case CreditCard creditCard -> "CreditCard ending in " + creditCard.getCreditCardNumber().substring(12);
            case PayPal payPal -> "PayPal ending in " + payPal.getEmail();
            case DomesticTransfer domesticTransfer -> "Domestic Transfer with bankCode: " + domesticTransfer.getBankCode();
            case InternationalTransfer internationalTransfer -> "International Transfer with bankCode: " + internationalTransfer.getBankCode();
        };
    }

    public BigDecimal calculateProcessingFee(PaymentMethod payment, BigDecimal amount) {
        return switch (payment) {
            case CreditCard cc -> amount.multiply(new BigDecimal("0.029")); // 2.9%
            case PayPal pp -> amount.multiply(new BigDecimal("0.034"));    // 3.4%
            case BankTransfer bt -> new BigDecimal("5.00");               // Flat $5
        };
    }
}
