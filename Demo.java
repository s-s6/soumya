public class Demo{
  public static void main(String args[]){
    System.out.println("Hello everyone ");
    students s1 = new students(2015, "AIM", 109);
    students s2 = new students(2006, "CSE", 44);
    String id1 = s1.getunique_id(2015);
    System.out.println("Unique ID for admissison from or after 2015 - " + id1);
    String id2 = s2.getunique_id();
    System.out.println("Unique ID for admissison before 2015 - " + id2);
  }
}
