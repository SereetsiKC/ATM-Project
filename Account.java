

public class Account {
    public int accountNumber;
    public double balance;
    public String customerName;
    public String customerSurname;
    public String gender;

    public void loadAccountData(int accNum, double bal, String custName, String custSname, String gend) {
        this.accountNumber = accNum;
        this.balance = bal;
        this.customerName = custName;
        this.customerSurname = custSname;
        this.gender = gend;
    }
}