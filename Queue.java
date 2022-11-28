public class Queue {
    char q[]; // this array holds the queue

    /*
    putLoc - Index that'll determine where the next element will be stored.

    getLoc - Index that'll determine what location the next element will come from.
    */
    int putLoc, getLoc;

    Queue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if (putLoc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putLoc++] = ch;
    }

    char get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getLoc++];
    }
}
