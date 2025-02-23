import java.util.Scanner;

public class PowerWithFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the power number:");
        int power = input.nextInt();
        System.out.print("Enter the base number:");
        int base = input.nextInt();
        int mul = 1;
        for(int i = 1; i <= power; i++){
            mul *= base;
        }

        System.out.println("The Power " + power + " of "+ base + " is: " +mul);



    }
}
