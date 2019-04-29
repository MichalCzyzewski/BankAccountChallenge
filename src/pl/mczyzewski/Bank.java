package pl.mczyzewski;

public class Bank
{
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;

    }



    public  double deposit(double deposit)
    {
        double newbalance;
        if(deposit>0)
        {
            newbalance= getBalance()+deposit;
            return newbalance;
        }

     return getBalance();
    }
}