import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int num = Integer.parseInt(br.readLine());
    System.out.println(hansoo(num));
  }

  public static int hansoo(int num) {
    int count = 0;
    int target = 0;
    int oneDigit = 0;
    int tenDigit = 0;
    int hundredDigit = 0;
    for (int i = 1; i <= num; i++) {
      if (i < 100) {
        count++;
      } else {
        target = i;
        // System.out.println("target: " + target);
        oneDigit = target % 10;

        target = target / 10;
        tenDigit = target % 10;

        hundredDigit = target / 10;
        // System.out.println("oneDigit: " + oneDigit);
        // System.out.println("tenDigit: " + tenDigit);
        // System.out.println("hundredDigit: " + hundredDigit);
        if ((oneDigit + hundredDigit) % 2 == 0 && (oneDigit + hundredDigit) / 2 == tenDigit) {
          count++;
          // System.out.println("\n++");
        }
        target = 0;
      }
    }

    return count;
  }
}
