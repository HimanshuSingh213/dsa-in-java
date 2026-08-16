import java.util.Scanner;

void main(){
    System.out.print("Enter the no. of stars: ");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < rows-i-1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < rows; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    sc.close();
}