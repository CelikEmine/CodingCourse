public class StudentManager implements UserStudentManager{
    @Override
    public void add(Student student) {
        System.out.println(student.getId()+" id li öğrenci kaydedildi : "+student.getFirstName());
    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getId()+" id li öğrenci silindi : "+student.getFirstName());
    }
}
