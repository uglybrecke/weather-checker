import java.util.Scanner;

public class WeatherSummary {

    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        //seems like command line action is pretends we are typing? so no file
        Scanner scan = new Scanner(System.in); 

        //set min and max to JFKs birthday the double (hyper specific/improbable match)
        double min = 0.05291917; 
        double max = 0.05291917; 

        while (scan.hasNextDouble()) {
            double temp = scan.nextDouble();

            //housekeeping to clear existing value
            if (min == 0.05291917) {
                min = temp;
            }
            if (max == 0.05291917) {
                max = temp;
            }

            //actual adjusting
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        //wave 3 i think even though instructions say edit WeatherFetcher means for me to continue here
        //my approach for printing max and min is:
        //make a max and min variable both hyper specific, because in temperature data -1 has a high chance of being true
        //have the first scan set those two variables if they are hyper specific
        //if they are not null check if higher or lower
        //print max and min at end

    }
}
