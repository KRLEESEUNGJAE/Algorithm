import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine().toUpperCase();
    int[] arr = new int[26];
    int max = 0;
    char c = '!';

    for (int i = 0; i < str.length(); i++) {
      arr[(int) str.charAt(i) - 65]++;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        c = (char) (i + 65);
      } else if (arr[i] == max) {
        c = '?';
      }
    }

    System.out.println(c);
  }
}
