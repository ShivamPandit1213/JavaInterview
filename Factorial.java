public class Factorial{
public static void main(String[] args){
  // 4! = 4 × 3 × 2 × 1
  // ✔ Answer: 24
  System.out.println("______________________________________________________________________________________________________");
  int num = 5, fact =1;
  for (int i =1; i<= num; i++) {
  fact = fact*i;
  }
  System.out.println("Factorial of '" + num + "' is: " + fact);
  System.out.println("______________________________________________________________________________________________________");
}
}
