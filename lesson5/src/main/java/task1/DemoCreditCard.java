package task1;

import java.util.Scanner;

public class DemoCreditCard {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(12345, 3200.00);
        CreditCard card2 = new CreditCard(23456, 1234.98);
        CreditCard card3 = new CreditCard(45321, 234.00);

        System.out.println("Amount was added successfully, current amount: " + (card1.setCurrentAmount(35.00)));

        System.out.println("Amount was added successfully, current amount: " + (card2.setCurrentAmount(210.44)));

        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();

        if(card3.getAmount(amount)) {
            System.out.println("Amount was withdrawn successfully");
        } else {
            System.out.println("Insufficient funds on the card");
        }

        card1.getCardInfo();
        card2.getCardInfo();
        card3.getCardInfo();
    }
}
