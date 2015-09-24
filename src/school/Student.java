
package school;

import static school.Person.people;

public class Student extends Person{
    
    private int gradeLevel;
    private Course theCourse;
    
    public static Student addStudent(String _name,Person.Gender _gender,int _weight,int _gradeLevel)
    {
        Student temp = new Student(_name, _gender, _weight, _gradeLevel);
        addPerson(temp);
        return(temp);
    }
    
    Student (String _name, Person.Gender _gender,int _weight, int _gradeLevel)
    {
        super(_name, _gender, _weight);
        gradeLevel = _gradeLevel;
    
    }
    public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            _course.addStudent(this);
        }
    }
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    } 
    public int getGradeLevel()
    {
        return(gradeLevel);
    }
    
    public static void printNames()
    {
        System.out.println("==printNamesStudents===");
        for(Person temp : people)
        {
            if(temp instanceof Student)
            System.out.println(temp.getName());
        }
    }  
    
}
