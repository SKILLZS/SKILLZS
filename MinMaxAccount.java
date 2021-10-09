//Answer to an assignment

public class MinMaxAccount extends BankAccount{

    double minimum;
    double maximum;

    // Constructs a MinMaxAccount with the given startingBalance
    public MinMaxAccount(double startingBalance) {
        minimum = startingBalance;
        maximum = startingBalance;
        deposit(startingBalance);
    }

    // Returns the current balance
    public double getBalance(){ return super.getBalance(); }

    // Returns the minimum balance ever recorded
    public double getMin(){
        return minimum;
    }

    // Returns the maximum balance ever recorded
    public double getMax(){
        return maximum;
    }

    // Adds the given amount to the current balance
    public void deposit(double amount){
        super.deposit(amount);

        if (getBalance() > maximum){
            maximum = getBalance();
        }
    }

    // Subtracts the given amount to the current balance
    public void withdraw(double amount){
        super.withdraw(amount);

        if (getBalance() < minimum){
            minimum = getBalance();
        }
    }

    // Returns a String representation of the current balance
    // e.g.) "$513.22"
    public String toString(){ return super.toString(); }
}
