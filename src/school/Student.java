
package school;

import static school.Person.people;

public class Student extends Person{
    
    private int gradeLevel;
    private Course courses[] = new Course[Course.numPeriods];
    private double gradeScore[] = new double[Course.numPeriods];
    
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
    
    public boolean addCourse(Course _course)
    {
        if(!setCourseOK(_course))
            return(false);
        if(!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course);
        return true;
    }
    
    public boolean setCourseOK(Course _course)
    {
        if(_course == null)
            return(false);
        if(courses[_course.getPeriod()-1] != null)
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course)
    {
        courses[_course.getPeriod() - 1] = _course;
    }
    
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    } 
    public int getGradeLevel()
    {
        return(gradeLevel);
    }
//    public double getGPA(Course _course)
//    {
//        return(gradeScore[_course.getPeriod()-1]);
//    }
    public static void printNames()
    {
        System.out.println("==printNamesStudents===");
        for(Person temp : people)
        {
            if(temp instanceof Student)
            System.out.println(temp.getName());
        }
    }  
        public void printTeachersNames()
    {
        System.out.println(getName() + " taught by");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if (temp.getTeacher() != null)
                {
                    System.out.println(temp.getTeacher().getName());
                }
            }
        }
    }
//    public String toString()
//    {
//        return(gradeLevel + " " + Person.name + " " + gender + " " + weight);
//    }
}
