import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.GroupLayout.Group;

import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Сергей", "Иванов", 25);
        Student s1 = new Student("Сергей", "Петров", 23, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 161);
        Student s3 = new Student("Иван", "Иванов", 20, 181);
        Student s4 = new Student("Игорь", "Иванов", 55, 131);
        Student s5 = new Student("Даша", "Цветкова", 34, 171);
        Student s6 = new Student("Лена", "Лебедева", 29, 111);
        Student s7 = new Student("Инна", "Чейчук", 18,6);
        Student s8 = new Student("Александр", "Шматков", 22,8);
        Student s9 = new Student("Елена", "Михалкова", 20,10);

        List<Student> listStud = new ArrayList<Student>();

        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(0, listStud);

        for(Student stud : group)
        {
            System.out.println(stud);
        }
        System.out.println("========== после сортировки");

        Collections.sort(group.getStudents());
        
        for(Student stud : group)
        {
            System.out.println(stud);
        }
        
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();
        studentList1.add(s1);studentList2.add(s4);studentList3.add(s7);
        studentList1.add(s2);studentList2.add(s5);studentList3.add(s8);
        studentList1.add(s3);studentList2.add(s6);studentList3.add(s9);



       StudentGroup group1 = new StudentGroup(1,studentList1);
       StudentGroup group2 = new StudentGroup(2,studentList2);
       StudentGroup group3 = new StudentGroup(3,studentList3);
       List<StudentGroup> groupList1 = new ArrayList<>();
       List<StudentGroup> groupList2 = new ArrayList<>();
       List<StudentGroup> groupList3 = new ArrayList<>();
       groupList1.add(group3);
       groupList2.add(group2);
       groupList2.add(group1);
       groupList3.add(group2);
       groupList3.add(group3);
       groupList3.add(group3);

      
       StudentSteam steam1 = new StudentSteam(2,groupList3);
       StudentSteam steam2 = new StudentSteam(3,groupList2);
       StudentSteam steam3 = new StudentSteam(1,groupList1);
       List<StudentSteam> steamList = new ArrayList<>();
       steamList.add(steam1);
       steamList.add(steam2);
       steamList.add(steam3);

     
       Collections.sort(steamList);
       Collections.sort(groupList1);
       Collections.sort(groupList2);
       Collections.sort(groupList3);

    
       for (StudentSteam s :steamList) {
           System.out.println(s.getGroups().size());
           for (StudentGroup g :s) {
               System.out.println(g);
           }
       }


       


    }
}
