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
    // StringBuilder sb = new StringBuilder();
    // int N = Integer.parseInt(br.readLine());
    int[] arr = new int[9];
    StringTokenizer st;
    for (int i = 0; i < 9; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int max = 0;
    int index = 0;

    for (int i = 0; i < 9; i++) {
      if (arr[i] > max) {
        max = arr[i];
        index = i;
      }
    }

    System.out.println(max);
    System.out.println(index + 1);

    // bw.newLine();
    // for(int i =0 ; i < 9; i++){
    //   bw.write(arr[i] + "");
    // }
    
    // bw.newLine();
    // bw.write(max + "");
    // bw.newLine();
    // bw.write(index + "");
    // bw.close();
  }
}
