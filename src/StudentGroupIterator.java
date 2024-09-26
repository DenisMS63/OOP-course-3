import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.counter = 0;
        this.studentList = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter ++;
        return studentList.get(counter);
    }

    @Override
    public void remove() {
        studentList.remove(counter);
    }
}
