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
  private float credits;
  private ArrayList<Integer> studentIds = new ArrayList<Integer>();
  
  
  Course(int courseId) {
    this.courseId = courseId;
  }
  
  Course(int courseId, int professorId) {
    this.courseId = courseId;
    this.professorId = prodessorId;
  }
  
  Course(int courseId, int professorId, float credits) {
    this.courseId = courseId;
    this.professorId = prodessorId;
    this.credits = credits;
  }
  
  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }
  public int getCourseId() {
    return courseId;
  }
  public void setProfessorId(int professorId) {
    this.professorId = professorId;
  }
  public int getProffesorId() {
    return professorId;
  }
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  public String getCourseName() {
    return courseName;
  }
  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }
  public int getMaxCapacity() {
    return maxCapacity;
  }
  public void setCredits(float credits) {
    this.credits = credits;
  }
  public float getCredits() {
    return credits;
  }

  
  public void registerStudent(int studentId) {
    this.studentIds.add(studentId);
  }
 
  
  
