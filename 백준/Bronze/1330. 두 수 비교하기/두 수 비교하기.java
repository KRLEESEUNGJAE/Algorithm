import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String answer = "";
    
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    if(n1 > n2){
      answer += ">";
    }else if(n2 > n1){
      answer += "<";
    }else{
      answer += "==";
    }
    
    System.out.println(answer);

  }
}