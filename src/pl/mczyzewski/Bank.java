package pl.mczyzewski;

public class Bank
{
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }


    public  double deposit(double deposit)
    {
        double newbalance;
        if(deposit>0)
        {
            newbalance= getBalance()+deposit;
            return balance=newbalance;
        }

     return getBalance();
    }

    public double withdraw(double withdraw)
    {
        if (withdraw> getBalance())
        {
            return getBalance();
        }
        double newbalance;
        newbalance = getBalance()-withdraw;
        return balance = newbalance;

    }


    public String getAccountInfo()
    {
      String info = "Id : " + getAccountNumber() + '\n' + "Name : " + getName() +
        '\n' + "Balance : " + getBalance() + '\n' + "e-mail : " + getEmail() +'\n' + "Phone Number : " + getPhoneNumber();
        return info;
    }
}