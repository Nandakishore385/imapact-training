// check the number of vowel/consonent
public class main {
    public static void main(String[] args) {
      String data = "programming";
      int vowel = 0;
      int consonent = 0;
      data = data.toLowerCase();
      for(int i=0;i<data.length();i++){
        char ch = data.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          vowel++;
        }else{
          consonent++;
        }
      }
      System.out.println(vowel);
      System.out.println(consonent);
    }
}