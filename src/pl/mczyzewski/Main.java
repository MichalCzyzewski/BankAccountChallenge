package pl.mczyzewski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank klient = new Bank();
        System.out.println("Enter klient name :");
        String nameOfKlient = scanner.nextLine();
        klient.setName(nameOfKlient);
        scanner.close();
        System.out.println("You enter name : " + klient.getName());


    }
}
