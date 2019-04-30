package pl.mczyzewski;

public class VipCustomer
{
    String name;
    double creditLimit;
    String emailAddress;

    public VipCustomer()
    {
        this("Defoult",0,"no email added");
    }

    public VipCustomer(String name, String emailAddress)
    {
        this(name,0,emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }
}
