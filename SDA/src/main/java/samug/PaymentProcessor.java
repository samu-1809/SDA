package samug;


public class PaymentProcessor {

    public void processPayment(Customer customer, double amount) {
        String paymentMethod = "credit"; 

        if ("credit".equals(paymentMethod)) {
            System.out.println("Procesando pago con tarjeta de crédito de " + String.format("%.2f", amount) + " para " + customer.getName());
        } else if ("paypal".equals(paymentMethod)) {
            System.out.println("Procesando pago con PayPal de " + String.format("%.2f", amount) + " para " + customer.getName());
        }
    }
}
