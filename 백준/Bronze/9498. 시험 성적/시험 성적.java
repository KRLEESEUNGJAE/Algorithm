import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String answer = "";

    int n = sc.nextInt();

    if (n >= 90 && n <= 100) {
      answer += "A";
    } else if (n >= 80 && n <= 89) {
      answer += "B";
    } else if (n >= 70 && n <= 79) {
      answer += "C";
    } else if (n >= 60 && n <= 69) {
      answer += "D";
    } else {
      answer += "F";
    }

    System.out.println(answer);

  }
}