## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

# Main Idea
The main Idea of this Project is to create a full School Management System with  **Java**
![alt text for screen readers](adventure-time-finn-and-jake-s-treehouse-9vl8l9a058e110hu.jpg)
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
