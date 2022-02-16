import entity.Student;
import repository.StudentDao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao=new StudentDao();
        List<Student> students = studentDao.findByFloatAttribute("averageMark ", 7.3f);
        for(Student student:students){
            System.out.println(student.toString());
        }
    }
}