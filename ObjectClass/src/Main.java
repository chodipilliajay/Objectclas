public class Main extends Object {
    public static void main(String[] args) {
        Student ajay = new Student("Ajay", 12);
        System.out.println(ajay.toString());
        PrimarySchoolStudent daniel = new PrimarySchoolStudent("Daniel", 10, "Raju");
        System.out.println(daniel);
         }}
class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name+" is "+age;
    }
}

class PrimarySchoolStudent extends Student {
    //can't extends more than more classes
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s kid, "+super.toString();
    }
    //calls primarySchoolStudent classes toString method because it is overridden
}