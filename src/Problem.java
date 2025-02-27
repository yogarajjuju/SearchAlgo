import java.util.*;
class Problem{
    static  void printDetails( int d , int e , int n){
        float amtA, amtB;
        amtA = (float) ((e* 0.15) + (n*0.2));
        amtB = (float) ((e* 0.35) + (n*0.25));
        if(d>100)
            amtA = (float) (amtA+(d-100)*0.25);

        if(d>250)
            amtB= (float) (amtB+(d-250)*0.45);
        System.out.println("Plan A cost  = " + amtA);
         System.out.println("Plan B cost  = " + amtB);
         if( amtA > amtB)  {
             System.out.println("Plan A is the cheap");
         }
         else if ( amtB > amtA) {
             System.out.println("Plan B is the cheap");

         }
         else {
             System.out.println("Both are equal");
         }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int evng = in.nextInt();
        int nit = in.nextInt();
        printDetails(day,evng, nit);
    }
}