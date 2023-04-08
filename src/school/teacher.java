package school;
/**
 * This class is responsible to track teachers 
 */
public class teacher{
    private int id;
    private String name;
    private int Salary;

    /**
     * 
     * @param id teacher id
     * @param name the name of the teacher
     * @param Salaray teacher Salary
     */
    public teacher(int id,String name,int Salaray){
        this.id=id;
        this.name=name;
        this.Salary=Salaray;
    }
    /**
     * get function
     * @return the Teacher name
     */
    public String getName(){
        return this.name;
    }
    /**
     * 
     * @return The Teacher ID
     */
    public int getId(){
        return id;
    }
    /**
     * 
     * @return The Teacher Salary
     */
    public int getSalaray(){
        return Salary;
    }
    /**
     * update Teacher Salary
     * @param Salary
     */
    public void setSalary(int Salary){
        this.Salary=Salary;
    }
/**
 * Get paied from School
 * @param sal
 */
    public void receiveSlary(int sal){
        Salary=sal;

    }
    
}