package com.example.tp;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Création et enregistrement des méthodes
        processor.addMethod(
            new CreditCard("1234-5678-9012-3456",
                           "Alice Dupont", 500.0)
        );
        processor.addMethod(
            new PayPal("bob@example.com", 200.0)
        );
        processor.addMethod(
            new Bitcoin("1A2b3C4d5E", 0.10) // solde en BTC
        );

        // Traitement des transactions
        double montant = 100.0;
        processor.processPayments(montant);
    }
}