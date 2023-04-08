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
 * Fees paid is initially 0
 * Evrey Student have to pay 30000
 * @param id student id "needs to be unique"
 * @param name student name
 * @param garde student grade

 */
    public student(int id,String name,int grade){
        this.feespaid=0;
        this.totalfees=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;


    }
    /**
     * 
     * @param grade is the new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;

    }
    /**
     * the amount of money that the Student give to the School
     * @param feespaid
     */
    public void UpdateFeesPaid(float fees){
        this.feespaid+=fees;

    }

    /**
     * 
     * @return Student Id
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @return Student name
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @return Student Grade
     */
    public int getGrade() {
        return grade;
    }
    /**
     * 
     * @return Paid fees
     */
    public float getFeespaid() {
        return feespaid;
    }
    /**
     * 
     * @return Total fees
     */
    public float getTotalfees() {
        return totalfees;
    }
    public void payFees(int fees){
this.feespaid+=fees;

    }
     /**
      * remaining Fees
     */
    public int remainingFees(){
return (int) (totalfees-feespaid);
    }

}
