package main;
import bank.BankAccount;
import bank.BankDetails;

public class Main {
    public static void main(String[] args) {


        /*//With created Constructor, private variables
        BankAccount b1 = new BankAccount(101,"sarjil",10.50);
        System.out.println(b1.getAccountNumber()+" "+b1.getAccountHolder()+" "+b1.getBalance());*/

        //With default constructor, private variables
        BankAccount b2 = new BankAccount();
        /*b2.setAccountNumber(201);
        b2.setAccountHolder("tonu");
        b2.setBalance(20.55);*/

        /*System.out.println(b2.getAccountNumber()+" "+b2.getAccountHolder()+" "+b2.getBalance());

        b1.branch(b1.getAccountHolder());
        b1.branch(b1.getAccountNumber());*/

        BankDetails d1 = new BankDetails();
        d1.setAccountNumber(201);
        d1.setAccountHolder("sarjil");
        d1.setBalance(20.55);

        d1.setBankBranch("Dhaka");
        d1.setBankname("new BANK");
        d1.setRoutingNumber(1234567890123456789L);

        //Overriding ei line hoitese..................
        d1.branch(d1.getBankBranch());
        //............................................

        b2.branch(d1.getAccountHolder());





    }




}