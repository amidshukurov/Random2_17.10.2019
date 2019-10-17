public class Envelope {
    public static void main(String[] args) {
        double tanNumber=8;
        System.out.println(Math.tan(tanNumber));
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 23; j++) {

                if (i == 1 || i == 8||j==1||j==22||j==i*3||22-j==i*3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
