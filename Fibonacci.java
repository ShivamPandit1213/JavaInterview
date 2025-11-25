public class Fibonacci{
public static void main(String[] args){
// Fibonacci = 0, 1, 1, 2, 3, 5, 8, 13

  System.out.println("______________________________________________________________________________________________________");
  int a =0, b=1, valueToPrint = 8;
  
  for (int i =1; i<=valueToPrint; i++) {
  System.out.println(a+" ");
  int sum = a + b;
  a = b;
  b = sum;
  }
  System.out.println("______________________________________________________________________________________________________");
}
}
