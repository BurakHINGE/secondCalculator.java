import java.util.Scanner;

public class eng_SecondsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int enteredSeconds = input.nextInt();
    
        int hours = enteredSeconds / 3600;
        int remainingSecondsAfterHours = enteredSeconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int remainingSecondsAfterMinutes = remainingSecondsAfterHours % 60;
        int remainingSeconds = remainingSecondsAfterMinutes;

        if (hours < 1 && minutes < 1) {
            System.out.println(enteredSeconds + " seconds is equal to " + remainingSeconds);
        }
        else if (hours < 1 && remainingSeconds < 1) {
            System.out.println(enteredSeconds + " seconds is equal to " + minutes + " minutes.");
        }
        else if (minutes < 1 && remainingSeconds < 1) {
            System.out.println(enteredSeconds + " seconds is equal to " + hours + " hours.");
        }
        else if (hours < 1) {
            System.out.println(enteredSeconds + " seconds is equal to " + minutes + " minutes, and " + remainingSeconds + " seconds.");
        }
        else if (minutes < 1) {
            System.out.println(enteredSeconds + " seconds is equal to " + hours + " hours, and "  + remainingSeconds + " seconds.");
        }
        else if (remainingSeconds < 1) {
            System.out.println(enteredSeconds + " seconds is equal to " + hours + " hours, and " + minutes + " minutes.");
        }
        
    }   
}
