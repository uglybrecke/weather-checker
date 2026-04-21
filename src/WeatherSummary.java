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
        Scanner scan = new Scanner(System.in); //seems like command line action is pretending that we are typing in the info from temp instead of reading in a file
        
        while (scan.hasNextDouble()) {
            double temp = scan.nextDouble();
            double min = null;
            
        }

        //wave 3 i think even though instructions say edit WeatherFetcher means for me to continue here
        //my approach for printing max and min is:
        //make a max and min variable both null
        //have the first scan set those two variables if they are null
        //if they are not null check if higher or lower
        //print max and min at end

    }
}
