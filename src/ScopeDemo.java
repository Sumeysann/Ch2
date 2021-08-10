public class ScopeDemo {
    public static void main(String arg[]) {
        int x; // x is accessible all in main
        x = 10;
        if (x == 10) { //create a new nested scope
            int y = 20; // y is known only in this block
//x is also known here because it’s scope is in all main
            System.out.println("now x is " + x + " and y is " + y);
            x = y * 2;
        }
//y is not accessible here
//System.out.println("now y is "+ y);
// x is still can access here
        System.out.println("here is x = " + x);
    }
}
