//Arrays Review, creates an array of animal names and finds the longest name, adds a 'z' to the end of every animal name, and prints them all with commas.

public class ArraysReview {
public static void main(String[] args){

    String animals[] = {"dog", "cat", "monkey","gorilla", "horse", "zebra", "mouse"};

    String longest = findLongest(animals);
    System.out.println(longest);
    addZees(animals);
    printArray(animals);
}
    public static String findLongest(String[] animal){
        int maxLength = 0;
        String longestString = null;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].length() > maxLength) {
                maxLength = animal[i].length();
                longestString = animal[i];
            }
        }
        return longestString;
    }

    public static void addZees(String[] animal) {
        String zees = "";
        for (int i = 0; i < animal.length; i++) {
            zees += animal[i] + "z, ";
        }

    System.out.println(zees.substring(0, zees.length() - 2));
    }

    public static void printArray(String[] animal){
        String animalNames = "";
        for (int i = 0; i < animal.length; i++) {
            animalNames += animal[i] + ", ";
        }

        System.out.println(animalNames.substring(0, animalNames.length() - 2));
    }
}
