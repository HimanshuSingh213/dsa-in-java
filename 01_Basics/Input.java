import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Enter the no. of lines: ");
        int input = ipt.nextInt();
        for(int i = 0; i < input; i++){
            for(int j = 0; j < i+1; j++)
                System.out.print("*");
            System.out.println("");

        }

        ipt.close();
    }
}
