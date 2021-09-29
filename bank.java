import java.util.Scanner;

public class bank {

    public static void pass(){
        System.out.println("please enter the password:");
        Scanner reader=new Scanner(System.in);
        int i=reader.nextInt();
        if(i==2021){
            details();
        }else {
            System.out.println("wrong password: ");
        }
    }
    public static void details(){
        System.out.println("please enter the details:");
         System.out.println("Enter your name:");
         Scanner reader=new Scanner(System.in);
         String str=reader.next();
         System.out.println("Please enter the phone number:");
         Scanner pho=new Scanner(System.in);
         long i= pho.nextLong();
        System.out.println("Enter your address:");
        Scanner add=new Scanner(System.in);
        String addr=reader.next();
         System.out.println("These are your details:");
         System.out.println("name : "+str);
         System.out.println("Phone number: "+i);
         System.out.println("Address:" +addr);
         System.out.println("If you want to apply for any loans,\n Press 1 to find out about the available loans.:");
         Scanner loa=new Scanner(System.in);
         int l=loa.nextInt();
         if(l==1){
             loan();

         }else {
             System.out.println("Thanks for your interest!");
         }
    }
   public static void loan(){
        System.out.println("This is a list of the loans that are currently accessible to you.");
        System.out.println(" 1.Gold loan\n 2.Personal loan\n 3.Car lan\n 4.Mortgage loan\n");
        Scanner loa=new Scanner(System.in);
        int a=loa.nextInt();
        switch (a){
            case 1:
                gold();
                break;
            case 2:
                pers();
                break;
            case 3:
                car();
                break;
            case 4:
                mort();
                break;
            default:
                System.out.println("You typed in the wrong number.");

        }
    }
    public static void back() {
        Scanner bac = new Scanner(System.in);
        int b = bac.nextInt();
        if (b == 1) {
            loan();
        }
    }
    public static void gold(){
        System.out.println("Gold loans are issued based on market value.");
        System.out.println("The rate of interest in gold is 7% to 29%");
        System.out.println("Press 1 to go back to the application.");
        back();
    }
    public static void pers(){
        System.out.println("Personal loans are issued based on your property.");
        System.out.println("The rate of interest in personal loan is 10% to 30%");
        System.out.println("Press 1 to go back to the application.");
        back();
    }
    public static void car(){
        System.out.println("Car loan issued based on your salary");
        System.out.println("The rate of interest in personal loan is 4% to 10%");
        System.out.println("Press 1 to go back to the application.");
        back();
    }
    public static void mort(){
        System.out.println("Mortgage loans issued based on your salary");
        System.out.println("The rate of interest in Mortgage loan is 7% to 12%");
        System.out.println();
        System.out.println("Press 1 to go back to the application.");
        back();

    }
    static class Main{
        public static void main(String[] args) {
            pass();
        }

    }
}
