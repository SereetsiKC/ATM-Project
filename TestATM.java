

import javax.swing.JOptionPane;
import java.lang.Exception;


public class TestATM{

    public static void main(String args){
        try{
            int accNum = Integer.parseInt(JOptionPane.showInputDialog("Please enetr your Account Number :"));
            double bal = Double.parseDouble(JOptionPane.showInputDialog("Please enetr your Balance :"));
            String custName = JOptionPane.showInputDialog("Please enter your Name :");
            String custSname = JOptionPane.showInputDialog("Please enter your Surname :");
            String gend = JOptionPane.showInputDialog("Please enter your gender :");

            Account account = new Account();
            account.loadAccountData(accNum,bal,custName,custSname,gend);

            int amountToWithDraw = Integer.parseInt(JOptionPane.showInputDialog("Please Eneter the amount to Withdraw :"));
            Withdraw  withdraw = new Withdraw();
            withdraw.withdrawAmount(amountToWithDraw,account);

        }catch(Exception ex){
            System.out.println("values entered are invalid");
        }
    }
}