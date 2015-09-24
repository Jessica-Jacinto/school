package school;
public class School {
    public static void main(String[] args) {
        
        
        Person joe = Person.addPerson("Joe", Person.Gender.Male, 125);
        Student jack = Student.addStudent("Jack", Person.Gender.Male, 100, 11);
        Student jill = Student.addStudent("Jill", Person.Gender.Female, 90, 11);
        Student billyJoe = Student.addStudent("BillyJoe", Person.Gender.Male, 105, 11);
        Student bobby = Student.addStudent("Bobby", Person.Gender.Male, 105, 11);
        Student janice = Student.addStudent("Janice", Person.Gender.Female, 105, 11);
        
        billyJoe.getWeight();
        int val = billyJoe.getWeight();
        
        
        Person.printNamesByGender(Person.Gender.Male);
        
        System.out.println(billyJoe);
        Course geom = Course.addCourse("Geometry", Course.Type.Math,1);
        
        Student.printNames();
        

        geom.addStudent(janice);
        
        System.out.println(bobby.getName());
        Person.printNames();
    }
}
