package ex_30_Exceptions;

public class Lab235_Custom_Exception_Example {
    public static void main(String[] args) throws CurrencyMisMatchCustomException {

        try {
            Bank sbi = new Bank("INR", 100, "Raj", 25);
            Bank icici = new Bank("INR", 123, "Ravi", 30);
            int total = sbi.add(icici);
            System.out.println("Total after adding accounts: " + total);

            // Invalid age — will trigger exception
            Bank underageAccount = new Bank("INR", 50, "Sam", 16);
            System.out.println("Created account: " + underageAccount);

        } catch (NotValidAgeException | CurrencyMisMatchCustomException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
