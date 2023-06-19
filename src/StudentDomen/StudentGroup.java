package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup> {
    private int numberGroup;
    private List<Student> students;

    public StudentGroup(int numberGroup, List<Student> students) {
        this.numberGroup = numberGroup;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
// переопределим метод для того чтобы брать данные с класса Student
    @Override
    public String toString() {
        StringBuilder strBid = new StringBuilder();
        strBid.append(String.format("numberGroup=%s\n", numberGroup));
        for (Student stud :students) {
            strBid.append(stud.toString());
            strBid.append("\n");
        }
        return strBid.toString();
    }

    // переопределим метод Iterator интерфейса Iterable созданием объекта StudentGroupIterator
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            public int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(index++);
            }
        };
    }
    // переопределим метод сортировки по номеру группы
    @Override
    public int compareTo(StudentGroup o) {
        return (this.numberGroup - o.numberGroup);
    }
}
