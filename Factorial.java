public class Factorial{
public static void main(String[] args){
  
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
