import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int digit1 = n2 % 10;
    int digit2 = n2 / 10 % 10;
    int digit3 = n2 / 100;

    int n3 = n1 * digit1;
    int n4 = n1 * digit2;
    int n5 = n1 * digit3;
    int n6 = n3 + (n4 * 10) + (n5 * 100);

    System.out.println(n3);
    System.out.println(n4);
    System.out.println(n5);
    System.out.println(n6);

  }
}