import java.util.Scanner;

public class ThreeAndFour {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= input.nextInt();
        int sum=0;
        int count=0;
        for (int i=1;i<=number;i++) {
            
            if ( i % 12 == 0) {

                sum+=i;
                count++;

            }
        }
        System.out.println("The sum of the digits that can be divide by 3 and 4 is: "+sum);
        System.out.println("The count of the digits that can be divide by 3 and 4 is: "+count);
        System.out.println("The average of the digits that can be divide by 3 and 4 is: "+sum/count);






    }
}
