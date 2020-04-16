package MyATM;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Withdraw {
    public void withdrawAmount(int amount, Account account)
    {
        Balance balance = new Balance();
        if (balance.checkBal(account) >= amount)
        {
            account.balance-=amount;

            System.out.println("Account Holder\t: ".concat(account.customerName).concat(" ").concat(account.customerSurname));
            System.out.println("Amount withdrawn\t: R".concat(String.valueOf(amount)));
            System.out.println("Available Balance\t: R".concat(String.valueOf(account.balance)));
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            System.out.println("Date Of Transaction\t: ".concat(dateFormat.format(date)));
        }
        else
        {
            System.out.println("insufficient funds");
            System.out.println("Account Holder\t: ".concat(account.customerName).concat(" ").concat(account.customerSurname));
            System.out.println("Amount requested\t: R".concat(String.valueOf(amount)));
            System.out.println("Available Balance\t: R".concat(String.valueOf(account.balance)));
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
            System.out.println("Date Of Transaction\t: ".concat(dateFormat.format(date)));
        }
    }
}