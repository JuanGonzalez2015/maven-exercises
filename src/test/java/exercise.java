
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type something fool");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
        try {
            int maybeANumber = Integer.parseInt(input);
            System.out.println("You entered a number!");
        }catch(NumberFormatException e){
            System.out.println("Flipped case: " + StringUtils.swapCase(input));
        }
        System.out.println("Reversed " + StringUtils.reverse(input));
        String string = "Flip it and reverse it";
        String reverse = StringUtils.reverse(string);
        String delimitedReverse = StringUtils.
                reverseDelimited(string, ' ');
        System.out.println("\nThe original String: " + string);
        System.out.println("The reversed string: " + reverse);
        System.out.println("The delimited Reverse string: "
                + delimitedReverse);
    }
    }

