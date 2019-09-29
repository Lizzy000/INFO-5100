/* 
Q1. Write a Java class named 'Course'
It should have following members
courseId
courseName
maxCapacity
professorId
credits
int[] studentIds

Function: registerStudent(int studentId)

There should be 3 ways to create Course Object (Hint : Use Constructor)
courseId
courseId, professorId
courseId, professorId, credits

Class should provide getters/setters for all members
registerStudent method should store all ids in studentIds array.
*/
public class Course {
  private int courseId, professorId;
  private String courseName;
  private int maxCapcity;
  private int credits;
//   private ArrayList<Integer> studentIds = new ArrayList<Integer>();
  private int[] studentIds = new int[maxCapacity];
  
  
  Course(int courseId) {
    if(courseId > 0) {
      this.courseId = courseId;
    }
    else System.out.printIn("please enter a valid Course ID.");
  }
  
  Course(int courseId, int professorId) {
    Course(courseId);
    String id = String.valueOf(professorId);
    
    if(id.length == 6){
      this.professorId = prodessorId;
    }else System.out.printIn("please enter a six digit number.")
  }
  
  Course(int courseId, int professorId, float credits) {
    Course(courseId, professorId);
    this.credits = credits;
  }
  
  
  
  public void setCourseId(int courseId) {
    Course(courseId);
  }
  public int getCourseId() {
    return courseId;
  }
  
  
  public void setProfessorId(int professorId) {
    if(id.length == 6){
      this.professorId = prodessorId;
    }
    else System.out.printIn("please enter a six digit number.")
  }
  public int getProffesorId() {
    return professorId;
  }
  
  
  public void setCourseName(String courseName) {
    if(courseName.length <= 60 && courseName.length >= 10) {
      this.courseName = courseName;
    }
    else System.out.printIn("please enter a valid name.");
    
  }
  public String getCourseName() {
    return courseName;
  }
  
  
  public void setMaxCapacity(int maxCapacity) {
    String max = String.valueOf(maxCapacity);
    if(max.length >= 10 && max.length <=100) {
      this.maxCapacity = maxCapacity;
    }
    else System.out.printIn("please enter a valid value.");
  }
  public int getMaxCapacity() {
    return maxCapacity;
  }
  
  
  public void setCredits(int credits) {
    String crdt = String.valueOf(credits);
    if(crdt.length == 1 && credits > 0) {
      this.credits = credits;
    }    
    else System.out.printIn("please enter a valid value.");
  }
  public int getCredits() {
    return credits;
  }

  
  public void registerStudent(int[] studentIds) {
    for(int i = 0; i < studentIds.lenght; i++) {
      this.studentIds[i] = studentId[i];
    }
  }
}
  
  
