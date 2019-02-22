import controller.MessageController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMessage {
    public static void main(String[] args) {
        MessageController mc = new MessageController();
        Scanner sc = new Scanner(System.in);
        int decision = -1;

        while (decision != 0) {
            System.out.println("Twoja poczta głosowa");
            System.out.println("Masz " + mc.getSize() + " nowych wiadomości");
            System.out.println("1. Odczytaj wiadomość \n2. Usuń wiadomość \n3. Dodaj wiadomość \n0. Wyjdź");
            try {
                decision = sc.nextInt();
                sc.nextLine();
                switch (decision) {
                    case 1:
                        mc.getMessage();
                        break;
                    case 2:
                        mc.deleteMessage();
                        break;
                    case 3:
                        System.out.println("Podaj adresata:");
                        String author = sc.nextLine();
                        System.out.println("Podaj treść wiadomości:");
                        String content = sc.nextLine();
                        mc.addMessage(content, author);
                        System.out.println("Zapisano wiadomość");
                        break;
                    case 0:
                        System.out.println("Dziękuję!");
                        break;
                    default:
                        System.out.println("Błędyn wybór");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Musisz podać wartość liczbową z zakresu 0-3");
                sc.nextLine();
            }
        }
    }
}
