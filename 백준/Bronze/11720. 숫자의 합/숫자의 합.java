import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int sum = 0;
    String nums = br.readLine();
    for (int i = 0; i < N; i++) {
      char c = nums.charAt(i);
      int n = Character.getNumericValue(c);
      sum += n;
    }

    System.out.println(sum);
  }
}
