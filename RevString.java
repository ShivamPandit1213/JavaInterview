public class RevString{
public static void main(String[] args){
  String testName = "Hello";
  String rev = "";
  for(int i = testName.length()-1; i >=0; i--){
    rev+=testName.charAt(i);
  }
  System.out.println("After Reverse String: "+rev);
}
}
