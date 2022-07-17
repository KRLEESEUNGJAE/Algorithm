
// import java.util.*;
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

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
    }

    bw.flush();
    bw.close();

    // String s = br.readLine(); // String
    // int i = Integer.parseInt(br.readLine()); // Int
    // String array[] = s.split(" "); // 공백마다 데이터 끊어서 배열에 넣음

    // String s = "abcdefg"; // 출력할 문자열
    // bw.newLine(); // 개행
    // bw.write(s + "\n"); // 버퍼에 있는 값 전부 출력
    // bw.flush(); //남아있는 데이터를 모두 출력시킴
    // bw.close(); // 스트림을 닫음
  }
}