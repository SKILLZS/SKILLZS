import java.util.*;

public class QueueVip {
    public static void main(String[] args) {
        Queue<String> clubList = new LinkedList<>();
        clubList.add("Mario (VIP)");
        clubList.add("Koopa Troopa");
        clubList.add("Bowser (VIP)");
        clubList.add("Goomba");
        clubList.add("Toad");
        clubList.add("Captain Toad (VIP)");
        clubList.add("Princess Peach (VIP)");
        clubList.add("Waluigi");

        System.out.println("Club List BEFORE");
        printQueue(clubList);

        prioritizeVips(clubList);

        System.out.println();
        System.out.println("Club List AFTER");
        printQueue(clubList);
    }

    public static void prioritizeVips(Queue<String> clubList) {
        Queue<String> temp = new LinkedList<>();

        int siz = clubList.size();
        for (int i = siz; i > 0; i--){
            String notVIP = clubList.remove();
            if (!notVIP.contains("VIP")){
                temp.add(notVIP);
            }
            else if (notVIP.contains("VIP")){
                clubList.add(notVIP);
            }
        }

        while(!temp.isEmpty()){
            String notVIP = temp.remove();
            clubList.add(notVIP);
            }
    }

    // Prints the contents of the given queue from front to back
    // to the console
    private static void printQueue(Queue<String> queue) {
        System.out.print("front <-  ");

        // fencepost - print the first item
        String first = queue.remove();
        System.out.print("\"" + first + "\"");
        queue.add(first);

        // print the remaining items
        for (int i = 1; i < queue.size(); i++) {
            String value = queue.remove();
            System.out.print(",  \"" + value + "\"");
            queue.add(value);
        }

        System.out.println("  <- back");
    }
}
