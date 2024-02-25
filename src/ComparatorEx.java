import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Chandu");
        Student st2 = new Student(2,"Govind");
        Student st3 = new Student(3,"Vinay");
        Student st4 = new Student(4,"Ajay");
        List<Student> al = Arrays.asList(st1,st2,st3,st4);
        //Ascending Order based on Student id
        //al.sort((o1,o2) -> o1.getStudentId() - o2.getStudentId());
        al.sort(Comparator.comparingInt(Student::getStudentId));
        System.out.println(al);
        //Descending Order based Student id
        al.sort((o1,o2) -> o2.getStudentId() - o1.getStudentId());
        System.out.println(al);
        //Ascending Order based on Student name
        //al.sort((o1,o2) -> o1.getStudentName().compareTo(o2.getStudentName()));
        al.sort(Comparator.comparing(Student::getStudentName));
        System.out.println(al);
        //Descending Order based Student name
        al.sort((o1,o2) -> o2.getStudentName().compareTo(o1.getStudentName()));
        System.out.println(al);
    }
}

class Student{
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
