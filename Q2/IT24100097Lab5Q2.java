import java.util.Scanner;

public class IT24100097Lab5Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int NewMembers = input.nextInt();

        if(NewMembers < 0 ){
            System.out.println("Input must be 0 or greater");
        }else {
                String prize;
                switch (NewMembers) {
                    case 0:
                        prize = "No prize";
                        break;
                    case 1:
                        prize = "Pen";
                        break;
                    case 2:
                        prize = "Umbrella";
                        break;
                    case 3:
                        prize = "Bag";
                        break;
                    case 4:
                        prize = "Travelling Chair";
                        break;
                    default:
                        prize = "Headphone";
                        break;
                        
                }
                System.out.println("The prize is: " + prize);
                
            }
    
    }
    
}
