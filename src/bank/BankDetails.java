package bank;


public class BankDetails extends BankAccount {

    private String bankname;
    private long routingNumber;
    private String bankBranch;



    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }
@Override
    public void branch(String accountHolder){

        System.out.println("bankBranch Name: "+accountHolder);
    }

}
