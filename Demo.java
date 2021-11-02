public class Demo{
  public static void main(String args[]){
    System.out.println("Hello everyone ");
    Students s1 = new Students(2015, "AIM", 109);
    Students s2 = new Students(2006, "CSE", 44);
    String id1 = s1.getunique_id(2015);
    System.out.println("Unique ID for admissison from or after 2015 - " + id1);
    String id2 = s2.getunique_id();
    System.out.println("Unique ID for admissison before 2015 - " + id2);
  }
}
