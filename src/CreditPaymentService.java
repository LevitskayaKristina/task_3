public class CreditPaymentService {
    public int calculate(int mounth, double interestRate, int loanAmount) {
        double monthlyInterestRate = interestRate / 12 / 100;
        double n = mounth;
        double a = 1 + monthlyInterestRate;
        double monthlyPayment = loanAmount * (monthlyInterestRate + (monthlyInterestRate / (Math.pow(a,n) - 1)));
        return (int) monthlyPayment;

    }
}
