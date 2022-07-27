import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int index = Integer.MIN_VALUE;
    int count = 0;
    int[] arr = new int[10];
    
    StringTokenizer st;
    for (int i = 0; i < 10; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken()) % 42;
    }

    Arrays.sort(arr);
    
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != index){
        index = arr[i];
        count++;
      }
    }

    System.out.println(count);
  }
}
