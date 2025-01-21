import java.util.Date;

public class Saudacao {
     public static void main(String[] args){
         Date date = new Date();
         int actualHour = date.getHours();
         actualHour = 18;

         if (actualHour < 6)
             System.out.println("boa madrugada");
         else if (actualHour < 12) {
             System.out.println("bom dia");
         } else if (actualHour < 18) {
             System.out.println("boa tarde");
         }else{
             System.out.println("boa noite");
         }
     }
}
