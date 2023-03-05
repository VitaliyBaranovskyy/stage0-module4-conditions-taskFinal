package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

int a = year%4;
        
      if (a>0){
      System.out.print("Year is not leap, ");}
      if (a==0){
       System.out.print("Year is  leap, ");}
       if(a<0){
           System.out.println("negative years are not accepted");
       }
      
               switch (month){
                   case 12:
                       System.out.println("Desember days = " + 31 );
                       break;
                       
                   case 1 :
                        System.out.println("January days = " + 31);
                        break;
                        
                    case 2 :
                        System.out.println("February days = " + 28);
                        break;
                        
                    case 3 :
                        System.out.println("March days = " + 31);
                        break;
                        
                    case 4 :
                        System.out.println("April days = " + 30);
                        break;
                        
                    case 5 :
                        System.out.println("May days = " + 31);
                        break;
                    
                    case 6 :
                        System.out.println("June days = " + 30);
                        break;
                        
                    case 7 :
                        System.out.println("July days = " + 31);
                        
                    break;
                    
                    case 8 :
                        System.out.println("Agust days = " + 31);
                        break;
                        
                    case 9 : 
                        System.out.println("September days = " + 30);
                        break;
                        
                    case 10:
                        System.out.println("October days = " + 31);
                        break;
                        
                    case 11:
                        System.out.println("November days = " + 30);
                        break;
                        
                        default:
                        System.out.println("invalid dat ");
                        break;
                        
               }
    }
    
    public static void main (String [] args){
        DaysInMonth main = new DaysInMonth() ;
        main.printDays(2020,5);
        
    }
}
