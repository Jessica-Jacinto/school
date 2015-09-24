package school;
import java.util.ArrayList;
public class Course {
    
    enum Type {
        Math, Science, English, History, Language, Elective, PE
    }
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private String name;
    private Type type;
    private int period;
    
    private Person theStudent;
    
        public static Course addCourse(String _name, 
        Type _type,int _period)
    {
        Course temp = new Course(_name, _type, _period);
//        people[currentPeopleIndex++] = temp;
        courses.add(temp);
        return temp;
    }
    Course()
    {
        name = "None";
        type = Course.Type.Math;
        period = 1;
    }
    Course(String _name, Type _type,int _period)
    {
        name = _name;
        type = _type;
        period = _period;
    }
    public void addStudent(Student _student)
    {
     if(theStudent == null)
     {
         theStudent = _student;
         _student.addCourse(this);
     }
    }
    public void setPeriod(int _period)
    {
        period = _period;
    } 
    public int getPeriod()
    {
        return(period);
    }
    public void setName(String _name)
    {
        name = _name;
    } 
    public String getName()
    {
        return(name);
    }
    public void setType(Type _type)
    {
        type = _type;
    }
    public Type getType()
    {
        return(type);
    }
    
    public static void printNames()
    {
        System.out.println("==printNames===");
        for(Course temp : courses)
        {
            System.out.println(temp.getName());
        }
    }      
    public static void printNamesByType(Course.Type _type)
    {
        System.out.println("==printNamesByGender===" + _type);
        for(Course temp : courses)
        {
            if(temp.type ==_type)
            System.out.println(temp.getName());
        }
    }
    
    public String toString()
    {
        return(name + " " + type + " " + period);
    }
    
            
}
