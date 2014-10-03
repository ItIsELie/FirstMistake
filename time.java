public class time{
 public static void main (String args[]){
 
   int number = 938445646;
   int hours = number/3600;
   int remainder = number%3600;
   int minutes = remainder/60;
   int seconds = remainder%60;
   
   System.out.println("Hours = " + hours + " Minutes = " + minutes + " Seconds = " + seconds);

 }
}