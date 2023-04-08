# School Management

# Main Idea
The main Idea of this Project is to create a full School Management System with  **Java**
![modules-of-the-school-management-system](V7a7320ij-modules-of-the-school-management-system)
So what this system will do :<br>
* Keep tracking of Students fees
* Teachers Salary 
* Total money earned


In this project we will use 2 principle classes: **Teacher** , **Student** and finally **School** class

**Student:**
* id
* name
* garde
* fees paid
* total fees
```java
public class student {
    private int id;
    private String name;
    private int grade;
    private float feespaid;
    private float totalfees;
}
```
**teacher**
* id
* name
* Salary
```java
public class teacher{
    private int id;
    private String name;
    private int Salary;
}

```
**School**
* Teachers
* Students
* Total Money Earned
* Totatal Money Spent
