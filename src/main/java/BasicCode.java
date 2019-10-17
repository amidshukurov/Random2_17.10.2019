public class BasicCode {
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        String msg = "Hello";
        System.out.println(msg);

        int z = add(5, 7);
        System.out.println(z);

        boolean isElgilbleFor = false;
        if (isElgilbleFor) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligilble");
        }

        int t = 5;
        switch (t) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("other than 1, 2 and 5");


        }
    }


}
