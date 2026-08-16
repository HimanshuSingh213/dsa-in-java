import java.util.Scanner;

void main() {
    System.out.print("Enter the no. of lines: ");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < rows - i; j++) {
            System.out.print("  ");
        }

        for (int j = 0; j < 2 * i + 1; j++) {
            if (i == 0 || i == rows - 1) {
                System.out.print("* ");
            } else {
                if (j == 0 || j == 2 * i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

        }

        System.out.println();
    }

    sc.close();
}