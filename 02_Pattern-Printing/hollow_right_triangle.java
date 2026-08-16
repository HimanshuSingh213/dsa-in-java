import java.util.Scanner;

void main() {
    System.out.print("Enter the no. of lines: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            if(i < 2 || i == n-1){
                System.out.print("* ");
            }
            else{
                if(j == 0 || j == i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
          
        }
        System.out.println();
    }

    sc.close();
}