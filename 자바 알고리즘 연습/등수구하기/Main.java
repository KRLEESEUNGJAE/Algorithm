import java.util.*;

public class Main {
  public int[] solution(int n, int[] arr) {
    int[] answer = new int[n];

    for(int i = 0; i < n; i++){
      int rank = 1;
      for(int j = 0; j < n; j++){
        if(arr[j] > arr[i]){
          rank++;
        }
      }
      answer[i] = rank;
    }
    
    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = kb.nextInt();
    }
    kb.close();
    for(int i = 0; i < T.solution(n, arr).length; i++){
      System.out.print(T.solution(n, arr)[i] + " ");
    }
  }
}
