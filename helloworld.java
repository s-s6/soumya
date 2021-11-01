public class Helloworld{
  public static void main(String args[]){
    System.out.println("Hello everyone");

     int index = 1;
        while (index <= 50) {
            System.out.println("Number 1: " + index);
            index++;
        }

    Student s1 = new Student(1,"Soumya",4);
    Student s2 = new Student();
    System.out.println("Student s1 = " + s1);
    System.out.println("Student s2 = " + s2);

    s2 = s1;
    System.out.println("Student s1 = " + s1);
    System.out.println("Student s2 = " + s2);
    System.out.println("Student s1 = " + s1.getyear());

  }
}
