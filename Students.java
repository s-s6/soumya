public class Students{
  private int admission;
  private String course;
  private int roll_no;

  public Students(int years, String courses, int rollnos){
    admission = years;
    course = courses;
    roll_no = rollnos;
  }

  public String getunique_id(int year){
    String unique_id1 = year + course + roll_no;
    return unique_id1;
  }

  public String getunique_id(){
    String unique_id2 = roll_no + course + admission;
    return unique_id2;
  }

}
