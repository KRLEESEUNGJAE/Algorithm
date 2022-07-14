import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 0;

    if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
      answer += 1;
    } 

    System.out.println(answer);

  }
}