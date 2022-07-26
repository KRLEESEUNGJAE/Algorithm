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

    int temp = 1;

    StringTokenizer st;

    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      int target = Integer.parseInt(st.nextToken());
      temp *= target;
    }
    
    int[] numArr = new int[10];
    Arrays.fill(numArr, 0);

    String str = Integer.toString(temp);
    int[] arr = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      arr[i] = Character.getNumericValue(str.charAt(i));
    }

    for (int i = 0; i < arr.length; i++) {
      numArr[arr[i]]++;
    }

    for(int i = 0; i < numArr.length; i++){
      System.out.println(numArr[i]);
    }

  }
}
