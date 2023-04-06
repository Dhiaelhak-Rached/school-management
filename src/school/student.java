package school;
/* This a Student class
 * id
 * name
 * garde
 * fees paid
 * total fees
*/
public class student {
    private int id;
    private String name;
    private int grade;
    private float feespaid;
    private float totalfees;
/**
 * 
 * @param id student id "needs to be unique"
 * @param name student name
 * @param garde student grade

 */
    public student(int id,String name,int garde){
        this.id=id;
        this.name=name;
        this.grade=grade;


    }
}
