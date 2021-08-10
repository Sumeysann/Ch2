public class Boolean {
    public static void main(String[] arg) {
        boolean b;
        b = true;
        System.out.println("now b is " + b);
        b = false;
        System.out.println("now b is " + b);
        if (b) {
            System.out.println("Now in false path");
        } else {
            System.out.println("now in true path");
        }
    }
}
