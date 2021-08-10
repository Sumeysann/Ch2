public class ScopeDemo2 {
    public static void main(String[] arg){
        boolean b=true;
        if(b){
//create smg as string if the condition is true
            String smgt="this is true path";
            System.out.println(smgt +" and b = "+ b);
        }else{
//if condition is false this variable will never create
            String smgf="this is false path";
            System.out.println(smgf +" and b = "+ b);
        }
//System.out.println(smgt + smgf); // error
    }
}
