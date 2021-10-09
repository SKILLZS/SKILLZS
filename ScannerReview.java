import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ScannerReview {

    //main method
    public static void main(String[] args) throws FileNotFoundException{
        //input
        Scanner input = new Scanner(System.in);
        //input prompt
        System.out.print("Please enter a zip code: ");

        //storing input as string
        String newInput = input.next();
        //putting input into method
        getZipCode(newInput);

        //space
        System.out.println();

    }

    //gets location and coordinates
    public static void getZipCode(String newInput) throws FileNotFoundException {
        File file = new File("zipcode.txt");

        //file scanner
        Scanner fileScan = new Scanner(file);

        //if the file doesn't end
        while (fileScan.hasNextLine()){
            //Storing and replacing each line
            String zipCode = fileScan.nextLine();

            //If the file contains the area code...
            if (zipCode.equals(newInput)){
                //Getting and printing area
                System.out.println("Location: " + fileScan.nextLine());

                //Getting coordinates
                String firstCoords = fileScan.next();
                String secondCoords = fileScan.next();

                //Printing coordinates
                System.out.print(firstCoords + ", " + secondCoords);
                break;

            }
        }
    }
}