package pl.mczyzewski;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        Bank klient = new Bank();
        System.out.println("Please enter Id :");
        klient.setAccountNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Please enter Name : ");
        klient.setName(scanner.nextLine());
        System.out.println("Please enter Balance : ");
        klient.setBalance(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Please enter E-mail : ");
        klient.setEmail(scanner.nextLine());
        System.out.println("Please enter Phone Number :");
        klient.setPhoneNumber(scanner.nextInt());
        scanner.nextLine();
//        klient.setNewAccount(nameOfKlientId,nameOfKlientName,nameOfKlientBalance,nameOfKlientEmail,nameOfKlientPhoneNumber);
        scanner.close();
        System.out.println( klient.getAccountInfo());
        System.out.println();
        System.out.println("*******************************");
        System.out.println();
        System.out.println("From account Id; 1 and balance :1" + klient.getBalance() + " withdrow - 1000 ");
        klient.withdraw(1000);
        System.out.println();
        System.out.println("*******************************");
        System.out.println();
        System.out.println(klient.getAccountInfo());
        System.out.println();
        System.out.println("*******************************");
        System.out.println();
        System.out.println("From account Id; 1 and balance :" + klient.getBalance() + " withdrow - 1400 ");
        klient.withdraw(1400);
        System.out.println();
        System.out.println("*******************************");
        System.out.println();
        System.out.println(klient.getAccountInfo());
        System.out.println();
        System.out.println("*******************************");
        System.out.println();
        System.out.println("To account Id; 1 and balance : " + klient.getBalance() + " deposit + 5000 ");
        klient.deposit(5000);
        System.out.println();
        System.out.println("*******************************");
        System.out.println();
        System.out.println(klient.getAccountInfo());



    }
}
