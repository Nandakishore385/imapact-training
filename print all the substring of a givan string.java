// print all the substring of a givan string
public class Main {
    public static void main(String[] args) {
      printSubSequence("abcac",0,"");
    }
    static void printSubSequence(String str,int index, String result){
      if(str.length()==index){
        System.out.println(result);
        return;
      }
      printSubSequence(str,index+1,result+str.charAt(index));
      printSubSequence(str,index+1,result);
    }
}