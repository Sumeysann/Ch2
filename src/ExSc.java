public class ExSc {
    boolean b= true;
    int i=10,j=20;
    if(!b & ((i+1)<j));
    System.out.println("without shot-circuit i is "+ i);
    i=10;
    if(!b && ((i+1)<j));
    System.out.println("with shot-circuit i is "+ i);
}
