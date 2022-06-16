import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<Student> students= new ArrayList<>(100);

        for (int i=0; i< students.size();i++){
            int ranAge= ThreadLocalRandom.current().nextInt(18,25);
            int ranY= ThreadLocalRandom.current().nextInt(1,7);
            Student student = new Student(ranAge,ranY);
            students.add(student);
            System.out.println("Sinh viên với tuổi: "+ student.getAge()+ " và số năm học" +student.getYear());
        }

    }
}

