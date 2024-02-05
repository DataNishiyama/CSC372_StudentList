//Import
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Ser Daryun", "Stormwind"));
        studentList.add(new Student(2, "Elara Shadowthorne", "Thieves Guild"));
        studentList.add(new Student(3, "Thrain Ironheart", "Stonepeak Mountains"));
        studentList.add(new Student(4, "Lunaria Starlight", "Teldrassil"));
        studentList.add(new Student(5, "Magus Khadghar", "Mage Tower"));
        studentList.add(new Student(6, "Grimmar Steelforge", "Ironforge"));
        studentList.add(new Student(7, "Isole Moonshadow", "Darnassus"));
        studentList.add(new Student(8, "Kieran Swiftwind", "Dragon Isles"));
        studentList.add(new Student(9, "Arya Frostwind", "Northrend"));
        studentList.add(new Student(10, "Bullauk Stormbringer", "Thunder Totem"));

        //Display Raw Student List
        System.out.println("Unsorted Student Roster:");
        for (Student student : studentList){
            System.out.println(student);
        }

        //Sort By Student Name
        SelectionSort.selectionSort(studentList, new StudentComparatorName());

        System.out.println("Student Sort by Name:");
        for (Student student : studentList){
            System.out.println(student);
        }

        //Sort By Student RollNo
        SelectionSort.selectionSort(studentList, new StudentComparatorRollNo());

        System.out.println("Student Sort by RollNo:");
        for (Student student: studentList){
            System.out.println(student);
        }




    }

    //End Main
}
