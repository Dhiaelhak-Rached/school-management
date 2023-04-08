package school;
/**
 * School class
 *  -Many Teachers using an Arry List
 */

import java.util.ArrayList;
import java.util.List;

public class school {
    // create an ArrayList to Store Teachers
    List <teacher> Teachers;

    //create an Array List to Store Students
    List <student> Students;
 
    private int totalMoneyEarned;
    private int totalMoneySpent;

/**
 * 
 * @param teachers ArrayList
 * @param students ArrayList
 * @param totalMoneyEarned
 * @param totalMoneySpent
 */
    public school(List <teacher> teachers,List <student> students){
        this.Teachers=teachers;
        this.Students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;

    }
    public void addTeachers(teacher teacher1)
    {
        Teachers.add(teacher1);
    }    

    public void addStudents(student student)
    {
        Students.add(student);
    }    

/**
 * create getters and setters for teachers
 * @return
 */
    public List<teacher> getTeachers() {
        return Teachers;
    }
    public void setTeachers(List<teacher> teachers) {
        Teachers = teachers;
    }


/**
 * create getters and setters for students
 * @return
 */
    public List<student> getStudents() {
        return Students;
    }
    public void setStudents(List<student> students) {
        Students = students;
    }






/**
 * 
 * @return Total Money Earned
 */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     * change Money Earned
     * @param totalMoneyEarned
     */
    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }
    public void UpdateTotalMoneyEarned(int mount){
        totalMoneyEarned+=mount;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    public void UpdateTotalMoneySpent(int mount) {
        totalMoneyEarned-= mount;
        
    }
    
}
