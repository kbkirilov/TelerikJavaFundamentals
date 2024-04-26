import java.util.Scanner;

public class CallDialApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // The variables names should be called firstProduct, secondProduct, thirdProduct etc...
        String product1 = "01.Potato";
        String product2 = "02.Fish";
        String product3 = "03.Apple";

        String menuDial = "Menu: Dial only one digit: 1 - Create Order";
        System.out.println(menuDial);

        int userChoiceInt = Integer.parseInt(userInput.next());

        System.out.printf("Here are our products: %s, %s, %s %n", product1, product2, product3);

        String messageTwo = "Enter the 2 digit product code to add it to the order";
        System.out.println(messageTwo);

        String item1 = userInput.next();
        System.out.printf("Product with code: %s was added to the order.%n", item1);
        String item2 = userInput.next();
        System.out.printf("Product with code: %s was added to the order.%n", item2);
        String item3 = userInput.next();
        System.out.printf("Product with code: %s was added to the order.%n", item3);

        String thankYouMessage = "Thank you for using our program!";
        String summary = "Summary of your interaction:";

        System.out.printf("%nOrders: 1 order containing [%s, %s, %s]", item1, item2, item3);

    }
}
