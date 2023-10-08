import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romanInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); 

        int result = romanToInt(romanNumeral);
        System.out.println("The integer representation of " + romanNumeral + " is: " + result);

        scanner.close();
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));

            if (i + 1 < s.length() && romanMap.get(s.charAt(i + 1)) > currentVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}
