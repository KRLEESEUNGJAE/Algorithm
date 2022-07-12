import java.util.*;

public class Main {
  public ArrayList<String> solution(int n1, int[] arr) {
    ArrayList<String> answer = new ArrayList<>();

    for(int i = 0; i < arr.length; i++){
      String binaryStr = Integer.toBinaryString(arr[i]);
      String tempStr = "";
      for(int j = binaryStr.length() - 1; j >= 0;  j--){
        if(binaryStr.charAt(j) == '1'){
          tempStr += binaryStr.length() - j - 1 + " ";
        }
      }
      answer.add(tempStr);
    }
    
    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int t = kb.nextInt();
    int[] arr = new int[t];
    for(int i = 0; i < t; i++){
      arr[i] = kb.nextInt();
    }
    
    for(int i = 0; i < T.solution(t, arr).size(); i++){
       System.out.println(T.solution(t, arr).get(i));
    }
  }
}