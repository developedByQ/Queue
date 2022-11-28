public class QueueDemo {
    // Used to Demonstrate the Queue Class
    public static void main(String[] args) {
        Queue bigQ = new Queue(30);
        Queue lilQ = new Queue(4);
        char ch;
        int i;

        // put the alphabet into bigQ
        for(i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.println("Contents of bigQ: ");
        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) {
                System.out.print(ch);
            }
        }

        System.out.println("\n");

        System.out.println("Now, we'll use lilQ to generate some errors.");

        for(i = 0; i < 5; i++) {
            System.out.print("Attempting to store: " + (char) ('Z' - i));
            lilQ.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.println("Contents of lilQ: ");
        for (i = 0; i < 5; i++) {
            ch = lilQ.get();
            if(ch != (char) 0) {
                System.out.println(ch);
            }
        }

    }
}