package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String Username = myscanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy");
        String Date = myscanner.nextLine();

        System.out.println("How many tickets would you like?: ");
        int Tickets = myscanner.nextInt();

        String pLetter = "";

        if (Tickets > 1){
            pLetter = "s";
        }

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate sanitizedDate = LocalDate.parse(Date, format);

        String[] names = Username.split(" ");

        System.out.println(Tickets + " ticket" + pLetter + " reserved for " + sanitizedDate + " under " + names[1] + ", " + names[0]);


    }
}
