import java.util.Scanner;

void main(){
    System.out.print("Enter the no. of lines: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print("  ");
        }

        for (int j = 0; j < (2*i+1); j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    sc.close();
}