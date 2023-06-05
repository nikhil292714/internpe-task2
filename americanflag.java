public class americanflag {
    public static void main(String[] args) {
        // Print the top section of the flag with stars and stripes
        for (int i = 0; i < 9; i++) {
            // Print stars and stripes in alternating pattern
            if(i%2==0) {
                System.out.print("* * * * * *  ");
                System.out.println("==================================");
            }

            // Print stars and stripes in the reversed alternating pattern
            else {
                System.out.print(" * * * * *   ");
                System.out.println("==================================");
            }
        }

        // Print the bottom section of the flag with only stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("===============================================");
        }
    }
}
