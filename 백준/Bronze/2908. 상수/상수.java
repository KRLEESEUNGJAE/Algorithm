import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());

    int newNum1 = reverse(num1);
    int newNum2 = reverse(num2);

    if (newNum1 > newNum2) {
      System.out.println(newNum1);
    } else {
      System.out.println(newNum2);
    }
  }

  public static int reverse(int num) {
    int digit1 = 0;
    int digit10 = 0;
    int digit100 = 0;
    int newNum = 0;

    digit1 = num % 10;
    num = num / 10;

    digit10 = num % 10;
    num = num / 10;

    digit100 = num;

    newNum = digit100 + (digit10 * 10) + (digit1 * 100);

    return newNum;
  }
}
