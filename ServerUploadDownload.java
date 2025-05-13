 //serverUploadDownload
import java.util.ArrayList;
public class serverUploadDownload   {
  public static void main(String[] args) {
    ArrayList<person> personList = new ArrayList<>();
    personList.add(new person("john","New York"));
    personList.add(new person("Jane","London"));
    personList.add(new person("Jack","Paris"));
    personList.add(new person("Jill","Tokyo"));
    System.out.println(personList);
    
    for (person p : personList){
      System.out.println(p.name + " " + p.address);
    }
     
  }
}
 
class person{
  String name;
  String address;
  person(String name, String address){
    this.name = name;
    this.address = address;
     
  }
   
}