package ex_30_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;
    private String customerName;
    private int customerAge;

    public Bank(String currency, Integer amount, String customerName, int customerAge) throws NotValidAgeException {
        if (customerAge < 18) {
            throw new NotValidAgeException("Customer age must be 18 or above.");
        }
        this.currency = currency;
        this.amount = amount;
        this.customerName = customerName;
        this.customerAge = customerAge;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public Integer add(Bank bankName) throws CurrencyMisMatchCustomException {
        if (this.currency.equals(bankName.currency)) {
            return this.amount + bankName.amount;
        } else {
            throw new CurrencyMisMatchCustomException("Currency MisMatch!");
        }
    }

    @Override
    public String toString() {
        return "Bank[customer=" + customerName + ", age=" + customerAge + ", currency=" + currency + ", amount=" + amount + "]";
    }
}

// Custom Exceptions
class CurrencyMisMatchCustomException extends Exception {
    public CurrencyMisMatchCustomException(String msg) {
        super(msg);
    }
}

class NotValidAgeException extends Exception {
    public NotValidAgeException(String e) {
        super(e);
    }
}