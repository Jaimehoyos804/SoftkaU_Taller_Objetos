package Class_Object;
/*
    Representa a una cuenta bancaria y sus cualidades
*/
public class BankAccount {
   /*
        Variables Nativas de la clase
    */
    
    private int accountNumber;
    protected boolean activated;
    public String holderName;
    
    /* Metodos getter y setter*/

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

   

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    /*Metodo Constructor para trabajar variables de la clase*/

    public BankAccount(int accountNumber, boolean activated, String holderName) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.holderName = holderName;
    }
    /*Constructo vacio para asignarle atributos*/

    public BankAccount() {
    }
    
    
}
