package pl.mczyzewski;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
//
//        Scanner scanner = new Scanner(System.in);
//        Bank klient = new Bank();
//        System.out.println("Please enter Id :");
//        klient.setAccountNumber(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("Please enter Name : ");
//        klient.setName(scanner.nextLine());
//        System.out.println("Please enter Balance : ");
//        klient.setBalance(scanner.nextDouble());
//        scanner.nextLine();
//        System.out.println("Please enter E-mail : ");
//        klient.setEmail(scanner.nextLine());
//        System.out.println("Please enter Phone Number :");
//        klient.setPhoneNumber(scanner.nextInt());
//        scanner.nextLine();
////        klient.setNewAccount(nameOfKlientId,nameOfKlientName,nameOfKlientBalance,nameOfKlientEmail,nameOfKlientPhoneNumber);
//        scanner.close();
//        System.out.println( klient.getAccountInfo());
//        System.out.println();
//        System.out.println("*******************************");
//        System.out.println();
//        System.out.println("From account Id; 1 and balance :1" + klient.getBalance() + " withdrow - 1000 ");
//        klient.withdraw(1000);
//        System.out.println();
//        System.out.println("*******************************");
//        System.out.println();
//        System.out.println(klient.getAccountInfo());
//        System.out.println();
//        System.out.println("*******************************");
//        System.out.println();
//        System.out.println("From account Id; 1 and balance :" + klient.getBalance() + " withdrow - 1400 ");
//        klient.withdraw(1400);
//        System.out.println();
//        System.out.println("*******************************");
//        System.out.println();
//        System.out.println(klient.getAccountInfo());
//        System.out.println();
//        System.out.println("*******************************");
//        System.out.println();
//        System.out.println("To account Id; 1 and balance : " + klient.getBalance() + " deposit + 5000 ");
//        klient.deposit(5000);
//        System.out.println();
//        System.out.println("*******************************");
//        System.out.println();
//        System.out.println(klient.getAccountInfo());
//
//
//
//        Account Michal = new Account();
//        Michal.withdrawal(1000);
//        Michal.deposit(50);
//        Michal.deposit(51);
//        Michal.withdrawal(100);

//        Account anna = new Account("1", 2000, "Anna", "poczta@wp.pl", "1234321");
//        System.out.println(anna.getNumber());
//        System.out.println(anna.getBalance());
//        System.out.println(anna.getCustomerName());
//        System.out.println(anna.getCustomerEmailAddress());
//        System.out.println(anna.getCustomerPhoneNumber());
//
//        System.out.println("++++++++++");
//        Account kamil = new Account();
//        System.out.println(kamil.getNumber());
//        System.out.println(kamil.getBalance());
//        System.out.println(kamil.getCustomerName());
//        System.out.println(kamil.getCustomerEmailAddress());
//        System.out.println(kamil.getCustomerPhoneNumber());
//
//        Account Mich = new Account("Mich","poczta@wo.pl","12342");
//        System.out.println( Mich.getNumber() + " of "+Mich.getCustomerName() + " same " + Mich.getCustomerEmailAddress());

        VipCustomer vip = new VipCustomer();
        System.out.println(vip.getCreditLimit() + " " + vip.emailAddress + " "+ vip.getName());

        System.out.println("--=======================--");

        VipCustomer vip2 = new VipCustomer("Poka","poczra@ww.pl");
        System.out.println(vip2.getName() + " " + vip2.getEmailAddress() + " " + vip2.getCreditLimit());

        System.out.println("--=======================--");

        VipCustomer vip3 = new VipCustomer("Michał",2000,"polaczek@wp.pl");
        System.out.println(vip3.getName() + " " + vip3.getCreditLimit() + " " + vip3.getEmailAddress());
    }
}
