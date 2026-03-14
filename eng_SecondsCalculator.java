import java.util.Scanner;

public class eng_SecondsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.print("Enter the number of seconds: ");
            int enteredSeconds = input.nextInt();
        
            int hours = enteredSeconds / 3600;
            int remainingSecondsAfterHours = enteredSeconds % 3600;
            int minutes = remainingSecondsAfterHours / 60;
            int remainingSecondsAfterMinutes = remainingSecondsAfterHours % 60;
            int remainingSeconds = remainingSecondsAfterMinutes;

            System.out.print((enteredSeconds == 1) ? enteredSeconds + " second is equal to: " : enteredSeconds + " seconds are equal to: ");

            if (enteredSeconds == 0) {
                System.out.print("0 seconds");
                System.out.println();
                continue;
            }
            if (hours > 0) {
                System.out.print(hours + " " + ((hours == 1) ? "hour" : "hours") + " ");
            }
            if (minutes > 0) {
                System.out.print(minutes + " " + ((minutes == 1) ? "minute" : "minutes") + " ");
            }
            if (remainingSeconds > 0) {
                System.out.print(remainingSeconds + " " + ((remainingSeconds == 1) ? "second" : "seconds") + " ");
            }

            System.out.println();
        }
    }   
}