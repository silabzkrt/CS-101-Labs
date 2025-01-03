package lab7;

public class lab07_Q2 {
    public static void joinQueue (int orderedLoafs, int[] queue) {
        int peopleInQ = 0;
        int size = queue.length;
        for (int i = 0; i < size ; i++) {
            if (queue[i]!= 0) {
                peopleInQ ++;
            }
        }
        if (peopleInQ == 20) {
            System.out.println("Queue is full.Order rejected");
        }

        for (int j = 0; j < size; j++){
            if (queue[j] == 0) {
                queue [j] = orderedLoafs;
                break;
            }
        }
        System.out.print("Current Queue:");
        for (int k = 0; k < size; k++) {
            int onePlace = -1;
            if (queue[k] != 0) {
                int [] result = queue.clone();

                int[] onesIndices = new int[queue.length];
                int count = 0;

                for (int i = 0; i < queue.length; i++) {
                    if (queue[i]==1) {
                        onesIndices[count++] = i; // Store indices of "1"
                    }
                }

                // Clear all "1"s from the result array
                for (int i = 0; i < count; i++) {
                    result[onesIndices[i]] = 0;
                }

                if (count > 0) {
                    // Start placing "1"s at the position of the first "1"
                    int position = onesIndices[0];
                    result[position] = 1;

                    for (int i = 1; i < count; i++) {
                        // Place the next "1" two indices after the previous one
                        position += 2;
                        if (position < result.length) {
                            result[position] = 1;
                        }
                    }
                }
                System.out.print(queue[k]);
            }
        }
        System.out.println();
        
    }
    public static void bake (int expectedLoafs, int[]queue){
        int breadLeft = expectedLoafs;
        int size = queue.length;
        System.out.println("Baking with " + expectedLoafs + " loaves available");

        for (int i = 0; i < size; i++) {
            if (queue[i] > 0) {
                if (queue[i] > breadLeft) {
                    System.out.println("Customer with order " + queue[i] + " loaves dismissed");
                    queue [i] = 0;
                }
                else {
                    breadLeft = breadLeft - queue[i];
                    queue [i]= 0;
                }
            }
        }

        if (queue.length == 0) {

        }
    }
    public static void main(String[] args) {
        int [] queue = new int [20];
        int queueSize = 0;
        System.out.println("---- Testing joinQueue ----");

        joinQueue(3, queue);
        joinQueue(2, queue);
        joinQueue(4, queue);
        joinQueue(1, queue);
        joinQueue(2, queue);
        joinQueue(2, queue);
        joinQueue(1, queue);
        joinQueue(1, queue);

        System.out.println("\n---- Testing full queue ----");
        for (int i =0; i < 12; i++) {
            joinQueue(2, queue);
        }
        joinQueue(1, queue);

        System.out.println("\n---- Testing Bake First ----");
        bake(8, queue);

        System.out.println("\n----Testing Bake Second----");
        queue = new int[20];
        bake(8, queue);
    }
}
