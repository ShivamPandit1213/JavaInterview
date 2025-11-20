public class Palindrome{
public static void main(String[] args){
  // Palindrome = "madam"
  // Not Palindrome = "Hello"
  System.out.println("______________________________________________________________________________________________________");

  String name = "madem";
  
  String rev = new StringBuilder(name).reverse().toString();
  if (name.equals(rev)) 
    System.out.println("String '"+name+"' is palindrome");
  else 
    System.out.println("String '"+name+"' is not Palindrome");
  System.out.println("______________________________________________________________________________________________________");
  
  String rev2 = "";
  for (int i=name.length()-1; i>=0; i--){
    rev2+=name.charAt(i);
  } 
  System.out.println("Original String: " + name);
  System.out.println("Reversed String: " + rev2);

      if (name.equals(rev2)) {
            System.out.println("\nResult: Palindrome");
      } else {
            System.out.println("\nResult: Not Palindrome");
      }
  System.out.println("______________________________________________________________________________________________________");
}
}
