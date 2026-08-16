import java.util.Scanner;

void main() {
    System.out.print("Enter the no. of line : ");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();

    for (int i = 0; i < rows; i++) {

        for (int k = 0; k < i; k++) {
            System.out.print("  ");
        }

        for (int j = 0; j < (2*rows-2*i-1); j++) {

            System.out.print("* ");
        }

        System.out.println();
    }

    sc.close();
}
