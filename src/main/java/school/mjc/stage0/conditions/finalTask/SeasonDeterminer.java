package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber){
    case 0 :
     System.out.println ("Wrong month number");
       break;

    case 1,2,12 :
  
       System.out.println ("Winter"); 
       break;
       
       case 3,4,5:
           System.out.println ("Spring");
           break;
           
           case 6,7,8:
               System.out.println ("Summer");
               
               case 9,10,11:
                   System.out.println ("Autumn");
                   break;
                   
                   default:
                   System.out.println ("Wrong month number");
           
    }
    
      
    }
    public static void main (String [] args){
       SeasonDeterminer main = new SeasonDeterminer();
       main.tellTheSeason(13);
    }  
    }
