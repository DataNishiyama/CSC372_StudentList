//Import
import java.util.Comparator;

//Compare Student by Name
public class StudentComparatorName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

}

