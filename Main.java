public class Main{
  public static void main(String args[]){
    System.out.println("Hello everyone -");
    int admission_yr = 2003;
    String course = "AIM";
    int rollno = 106;
    if(admission_yr >= 2015)
    {
      System.out.println("The user's unique id = " + admission_yr + course + rollno);
    }
    else
    {
      System.out.println("The user's unique id = " + rollno + course + admission_yr);
    }
  }
}
