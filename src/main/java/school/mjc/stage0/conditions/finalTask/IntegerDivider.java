package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
         if (dividend % divider == 0){
                int a = dividend / divider;
           System.out.println(a);
           
           if (a * divider == dividend ){
               System.out.println("can be divided completely");
           }
           
           
               
           }
           else
           System.out.println("cannot be divided completely");
   
       }
       
       
       
       public static void main (String [] args){
           
           IntegerDivider main = new IntegerDivider();
           main.printCompletelyDivided(36,7);
        
        
    }
}
