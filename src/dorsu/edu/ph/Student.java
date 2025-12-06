
import java.io.Serializable;
public class Student extends Person implements Serializable{
    int id;
    String course;
    double gpa;

    public Student() {
        
    }

    public Student(int id, String name, int age, String course, double gpa) {
        super(name, age);
        this.id = id;
        this.course = course;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    
    
    
    
    
}
