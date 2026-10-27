public class Main  {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int mouth = 12;
        double interestRate = 9.99;
        int loanAmount = 1_000_000;
        int monthlyPayment = service.calculate(mouth, interestRate, loanAmount);
        System.out.println("Срок кредита 1 год. Ежемесячный платеж составит: " + monthlyPayment + " руб.");

        int monthlyPayment_2 = service.calculate(24, interestRate, loanAmount);
        System.out.println("Срок кредита 2 года. Ежемесячный платеж составит: " + monthlyPayment_2 + " руб.");

        int monthlyPayment_3 = service.calculate(36, interestRate, loanAmount);
        System.out.println("Срок кредита 3 года. Ежемесячный платеж составит: " + monthlyPayment_3 + " руб.");

    }
}