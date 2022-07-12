import java.util.*;

public class Main {
  public int solution(int n1, int n2) {
    int answer = 0;
    ArrayList<Integer> temp = new ArrayList<>();

    for(int i = 1; i <= n1; i++){
      if(n1 % i == 0){
        temp.add(i);
      }
    }

    if(temp.size() > n2-1){
      answer = temp.get(n2-1);
    }
    
    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n1 = kb.nextInt();
    int n2 = kb.nextInt();
    kb.close();
    System.out.println(T.solution(n1, n2));
  }
}