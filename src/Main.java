public class Main {

    public static void main(String[] args) {

       Student student1=new Student(1,"@gmail.com","emine","çelik");
       Instructor instructor1=new Instructor(2,"@gmail.com","hasan","çelik");

       UserInstructorManager instructorManager=new InstructorManager();
       instructorManager.add(instructor1);

       UserStudentManager userStudentManager=new StudentManager();
       userStudentManager.add(student1);



    }
}
