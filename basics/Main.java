import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

//this is the main class
public class Main {

    //This var is knowing the previous second so it doesn't double the time.
    private static int second;

    // For Stretch Goals
    private static double startTime;

    //This method is running when the app run.
    public static void main(String[] args) {
        // call pluralize with cat as first arg and 0 as 2nd arg.
        System.out.println(pluralize("Cat",1));

        // call flipNHeads with 3 as first arg
        flipNHeads(4);

        //call First Solution clock.
        //clock();

        //call 2nd Solution clock
        clock2nd();
    }

    // The pluralize declaration.
    private static String pluralize(String word , int num){
        // print the word with s if num is 0 or more than  1 and without s it num is one
         return  "I own ".concat(num+"").concat(" ").concat(num == 0 || num > 1 ? word + 's' : word);
    }

    // The flipNHeads declaration.
    private static void flipNHeads(int n) {
        // count to count the num of head.
        int count = 0;

        // totalCout to count the all rounds;
        int totalCout = 0;

        // while loop until the num of head = count.
        while (count < n){
            // print head or tails depend on the value of Math.random() * 1
            if(Math.random() * 1 < 0.5 ){
                count = 0;
                System.out.println("tails");
            }else {
                count++;
                System.out.println("heads") ;
            }
            //count total rounds
            totalCout++;
        }
        //print the final result.
        System.out.println("It took ".concat(Integer.toString(totalCout)).concat(" ").concat("flips to flip ").concat(Integer.toString(n)).concat(" ").concat(" heads in a row."));
    }

    // first solution clock declaration.
    private static void clock () {
        //set the Timer;
        new Timer();
        // this method will work every 1 sec;
        javax.swing.Timer t = new javax.swing.Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // make obj of LocalDateTime.
                LocalDateTime now = LocalDateTime.now();
                // print the time.
                System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
        });
        // start the method => this method is like settimeout in JS
        t.start();
    }

    // 2nd solution clock declaration.
    private static void clock2nd () {
        while (true){
            // make obj of LocalDateTime.
            LocalDateTime now = LocalDateTime.now();
            // to know the Present secز
            int newSec = now.getSecond();
            //check if the newSec = the previous to not print the same time 2 time.
            if(newSec != second) {
                System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")).concat(" " + Double.toString( (System.nanoTime() -  startTime) /100000000)) +  " MHz");
                startTime = System.nanoTime();
            };
            //update the previous second
            second = newSec;
        }
    }
}
