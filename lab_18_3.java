import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class lab_18_3 {

    public static void main(String[] args){
        System.out.println("Working Directory " + System.getProperty("user.dir"));
        //gets and prints the working directory
        System.out.println("Programmer: " + System.getProperty("user.name") + "(Jojo Day)");
        //gets and prints the username
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy @ HH:mm");
        //sets a date format
        LocalDateTime now = LocalDateTime.now();
        //gets the current time
        System.out.println("Lab 18.2: " + dtf.format(now) + "\n");
        //prints the lab and date formatted
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        String[] order = {"first", "second", "third", "fourth", "fifth"};
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.printf("Enter the %s test score: ", order[i]);
            scores[i] = console.nextInt();
        }
        System.out.printf("%s, here are the grades and the average:\n", name);
        for (int i = 0; i < scores.length; i++){
            System.out.printf("\nTest %d: %s", i+1, determineGrade(scores[i]));
        }
        System.out.printf("\nAverage score: %.2f", calcAverage(scores));
        System.out.printf("\nAverage Letter Grade: %s", determineGrade((int)(calcAverage(scores))));
    }

    public static double calcAverage(int[]scores){
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum/scores.length;
    }

    public static String determineGrade(int score){
        if(score > 90){
            return "A";
        }else if(score > 80){
            return "B";
        }else if(score > 70){
            return "C";
        }else if(score > 60){
            return "D";
        }else{
            return "F";
        }
    }
}
