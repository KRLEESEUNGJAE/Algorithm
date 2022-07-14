import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int M = sc.nextInt();
    int T = sc.nextInt();

    M += T;
    if(M >= 60){
      while(M >= 60){
      M -= 60;
      H++;
      }
    }

    if(H >= 24){
      H -= 24;
    }
    
    System.out.println(H + " " + M);
  }
}