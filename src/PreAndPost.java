public class PreAndPost {
    public static void main(String[] arg) {
        int i = 10;
        int x = 0;
        int y = ++x;
        System.out.println("now ++x => x=" + x + "and y=" + y);
        x = 10;
        y = x++;
        System.out.print("and then x++=>x=" + x + "and y=" + y);
    }
}
