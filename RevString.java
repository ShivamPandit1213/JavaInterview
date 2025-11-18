public class RevString{
public static void main(String[] args){
  String testName = "Hello";
  String rev = "";
  For(int i = testName.length()-1; i >=0; i--){
    rev+=testName.chatAt(i);
  }
  System.out.println("After Reverse String: "+rev);
}
}
