import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students= new ArrayList<Student>(100);

        for (int i=0; i< 100;i++){
            int ranAge= ThreadLocalRandom.current().nextInt(18,25);
            int ranY= ThreadLocalRandom.current().nextInt(1,7);
            Student student = new Student(ranAge,ranY);
            students.add(student);
            System.out.println("Sinh viên với tuổi: "+ student.getAge()+ " và số năm học " +student.getYear());
        }
        System.out.println("--------");
        List<Student> studentList=  students.stream().sorted((a1,a2) -> a1.getAge() - a2.getAge()).limit(10)
                .sorted((a1,a2) -> a2.getYear() - a1.getYear()).collect(Collectors.toList());
        for (int i=0; i< 10;i++){
            System.out.println("Sinh viên với tuổi nhỏ nhất "+ studentList.get(i).getAge()+ " và số năm học nhiều nhất " +studentList.get(i).getYear());
        }
    }
}

