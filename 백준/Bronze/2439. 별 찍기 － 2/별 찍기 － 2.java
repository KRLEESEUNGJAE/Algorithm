import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String star = "*";

    for (int i = N - 1; i >= 0; i--){
      for(int j = 0; j < i; j++){
        bw.write(" ");
      }
      bw.write(star);
      bw.newLine();
      star += "*";
    }
    br.close();

    bw.flush();
    bw.close();
  }
}