//Creates a method that take 3 numbers, each number being a side of a triangle, and tells you the type of it
//Pick a random number and if its even 3 times in a row you get a message 

public class ConditionalsPractice {
    public static void main(String[] args) {
        printTriangleType(1, 2, 4);
        threeEvens();
    }

    public static void printTriangleType(int a, int b, int c)throws IllegalArgumentException{
        if((a != b && b!= c && c != b)){
            System.out.println("Scalene");
        }

        else if((a == b && b == c)){
            System.out.println("Equilateral");
        }

        else{
            System.out.println("Isosceles");
        }

    }

    public static void threeEvens(){

        boolean evens = false;
        int evenCounter = 0;

        while(!evens){

            int rand = (int)(Math.random() * 10) + 1;
            System.out.println(rand);
            if(rand % 2 == 0){
                evenCounter += 1;
            }

            else{
                evenCounter = 0;
            }

            if (evenCounter == 3){
                System.out.println("Congratulations! You got 3 evens in a row!");
                evens = true;
            }
        }
    }
}
