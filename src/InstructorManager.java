public class InstructorManager implements UserInstructorManager{
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getId()+" id li eğitmen sisteme eklendi :"+instructor.getFirstName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println(instructor.getId()+" id li eğitmen sistemden silindi :"+instructor.getFirstName());
    }
}
