import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManip {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        var something = myScanner.nextLine();

        if(StringUtils.isNumeric(something)){
            System.out.printf("You entered \"%s\"\n",something);
            System.out.printf("\"%s\" is a number.\n",something);
        }else{
            System.out.printf("You entered \"%s\"\n",something);
            System.out.printf("\"%s\" isn't a number.\n",something);
        }

        String myString = "thisthingwillbereversed";
        System.out.printf("FLIPPED CASE: %s\n",StringUtils.swapCase(myString));
        System.out.printf("REVERED: %s\n",StringUtils.reverse(myString));
    }
}
