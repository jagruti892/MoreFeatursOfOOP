import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("       DCST NIRF MANAGEMENT SYSTEM");
            System.out.println("======================================");

            System.out.println("\nSelect an OOP Feature:");
            System.out.println("1. Object Referencing & Constructors");
            System.out.println("2. Static Attributes, Methods & Enums");
            System.out.println("3. Multiple Inheritance");
            System.out.println("4. Access Modifiers");
            System.out.println("5. Abstract Classes & Interfaces");
            System.out.println("6. Class as a Type & Message Passing");
            System.out.println("7. Polymorphism");
            System.out.println("8. Generics & Collection Frameworks");
            System.out.println("9. Exception Handling");
            System.out.println("10. Reflection, Persistence, I/O, RTTI & Cloning");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    feature1();
                    break;

                case 2:
                    feature2();
                    break;

                case 3:
                    feature3();
                    break;

                case 4:
                    feature4();
                    break;

                case 5:
                    feature5();
                    break;

                case 6:
                    feature6();
                    break;

                case 7:
                    feature7();
                    break;

                case 8:
                    feature8();
                    break;

                case 9:
                    feature9();
                    break;

                case 10:
                    feature10(scanner);
                    break;

                case 0:
                    System.out.println(
                            "\nExiting DCST NIRF Management System...");
                    break;

                default:
                    System.out.println(
                            "\nInvalid choice. Please select 0-10.");
            }

        } while (choice != 0);

        scanner.close();
    }

    // =========================================
    // 1. OBJECT REFERENCING & CONSTRUCTORS
    // =========================================

    public static void feature1() {

        System.out.println(
                "\n\n1. OBJECT REFERENCING & CONSTRUCTORS");

        Student student1 = new Student(
                101,
                "Jagruti",
                "MCA",
                1);

        System.out.println("\nStudent 1:");
        student1.displayStudent();

        Student student2 = student1;

        student2.setProgram("MCA - Updated");

        System.out.println(
                "\nAfter changing program through Student 2:");

        System.out.println(
                "Student 1 Program: MCA - Updated");

        System.out.println(
                "Student 2 Program: MCA - Updated");

        System.out.println(
                "\nBoth references point to the same object: "
                        + (student1 == student2));
    }

    // =========================================
    // 2. STATIC ATTRIBUTES, METHODS & ENUMS
    // =========================================

    public static void feature2() {

        System.out.println(
                "\n\n2. STATIC ATTRIBUTES, METHODS & ENUMS");

        Student student = new Student(
                102,
                "Rahul",
                "BCA",
                3);

        System.out.println("\nStudent object created:");
        student.displayStudent();

        System.out.println();
        Student.displayMemberCount();

        System.out.println("\nAvailable DCST Member Types:");

        for (MemberType type : MemberType.values()) {
            System.out.println("- " + type);
        }
    }

    // =========================================
    // 3. MULTIPLE INHERITANCE
    // =========================================

    public static void feature3() {

        System.out.println("\n\n3. MULTIPLE INHERITANCE");

        Student student = new Student(
                101,
                "Jagruti",
                "MCA",
                1);

        System.out.println("\nStudent ID:");
        student.displayId();

        System.out.println("\nStudent Report:");
        student.generateReport();

        System.out.println(
                "\nStudent uses an interface inherited from "
                        + "Reportable and Identifiable.");

        System.out.println(
                "Java does not support multiple inheritance "
                        + "using classes.");
    }

    // =========================================
    // 4. ACCESS MODIFIERS
    // =========================================

    public static void feature4() {

        System.out.println("\n\n4. ACCESS MODIFIERS");

        AccessModifier accessDemo = new AccessModifier(
                101,
                "Jagruti",
                "MCA");

        System.out.println(
                "\nPublic data accessed outside the class:");

        System.out.println(
                "Student ID: " + accessDemo.studentId);

        System.out.println(
                "\nData accessed inside AccessModifier:");

        accessDemo.showInsideClassAccess();

        System.out.println(
                "\nPrivate data accessed through a public method:");

        accessDemo.showPrivateData();

        System.out.println(
                "\nProtected data accessed through child class:");

        AccessModifierChild child = new AccessModifierChild(
                102,
                "Rahul",
                "BCA");

        child.showProtectedAccess();
    }

    // =========================================
    // 5. ABSTRACT CLASSES & INTERFACES
    // =========================================

    public static void feature5() {

        System.out.println(
                "\n\n5. ABSTRACT CLASSES & INTERFACES");

        TeachingStaff teachingStaff = new TeachingStaff(
                201,
                "Dr. Anita",
                "Internet Technologies");

        System.out.println("\nTeaching Staff:");

        teachingStaff.displayBasicDetails();
        teachingStaff.displayRole();
        teachingStaff.participateInActivity();

        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff(
                301,
                "Mr. Ramesh",
                "Administration");

        System.out.println("\nNon-Teaching Staff:");

        nonTeachingStaff.displayBasicDetails();
        nonTeachingStaff.displayRole();
        nonTeachingStaff.participateInActivity();
    }

    // =========================================
    // 6. CLASS AS A TYPE & MESSAGE PASSING
    // =========================================

    public static void feature6() {

        System.out.println(
                "\n\n6. CLASS AS A TYPE & MESSAGE PASSING");

        ActivityManager activityManager = new ActivityManager();

        TeachingStaff teachingStaff = new TeachingStaff(
                201,
                "Dr. Anita",
                "Internet Technologies");

        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff(
                301,
                "Mr. Ramesh",
                "Administration");

        System.out.println(
                "\nTeaching Staff participating:");

        ActivityParticipant participant1 = teachingStaff;

        activityManager.registerParticipant(
                participant1);

        System.out.println(
                "\nNon-Teaching Staff participating:");

        ActivityParticipant participant2 = nonTeachingStaff;

        activityManager.registerParticipant(
                participant2);
    }

    // =========================================
    // 7. POLYMORPHISM
    // =========================================

    public static void feature7() {

        System.out.println("\n\n7. POLYMORPHISM");

        TeachingStaff teachingStaff = new TeachingStaff(
                201,
                "Dr. Anita",
                "Internet Technologies");

        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff(
                301,
                "Mr. Ramesh",
                "Administration");

        System.out.println("\nMethod Overriding:");

        AbstractMember member;

        member = teachingStaff;

        System.out.println("\nTeaching Staff:");
        member.displayBasicDetails();
        member.displayRole();

        member = nonTeachingStaff;

        System.out.println("\nNon-Teaching Staff:");
        member.displayBasicDetails();
        member.displayRole();

        System.out.println("\nMethod Overloading:");

        ReportManager reportManager = new ReportManager();

        Student student = new Student(
                102,
                "Rahul",
                "BCA",
                3);

        reportManager.generateReport(student);
        reportManager.generateReport(teachingStaff);
    }

    // =========================================
    // 8. GENERICS & COLLECTION FRAMEWORKS
    // =========================================

    public static void feature8() {

        System.out.println(
                "\n\n8. GENERICS & COLLECTION FRAMEWORKS");

        Student student1 = new Student(
                101,
                "Jagruti",
                "MCA",
                1);

        Student student2 = new Student(
                102,
                "Rahul",
                "BCA",
                3);

        System.out.println("\nGeneric Class:");

        DCSTCollection<Student> studentData = new DCSTCollection<>(student2);

        studentData.displayData();

        System.out.println("\nGeneric Function:");

        Student genericStudent = DCSTCollection.getData(student2);

        genericStudent.displayStudent();

        System.out.println("\nList of DCST Students:");

        java.util.List<Student> studentList = new java.util.ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);

        for (Student student : studentList) {
            student.displayId();
        }

        System.out.println("\nQueue of DCST Members:");

        java.util.Queue<String> memberQueue = new java.util.LinkedList<>();

        memberQueue.add("Jagruti - MCA");
        memberQueue.add("Rahul - BCA");
        memberQueue.add("Dr. Anita - Teaching Staff");

        while (!memberQueue.isEmpty()) {
            System.out.println(memberQueue.poll());
        }

        System.out.println("\nSet of DCST Programs:");

        java.util.Set<String> programs = new java.util.HashSet<>();

        programs.add("MCA");
        programs.add("BCA");
        programs.add("MCA");

        for (String program : programs) {
            System.out.println(program);
        }

        System.out.println("\nMap of Student ID and Name:");

        java.util.Map<Integer, String> studentMap = new java.util.HashMap<>();

        studentMap.put(101, "Jagruti");
        studentMap.put(102, "Rahul");

        for (java.util.Map.Entry<Integer, String> entry : studentMap.entrySet()) {

            System.out.println(
                    "Student ID: " + entry.getKey()
                            + ", Name: " + entry.getValue());
        }
    }

    // =========================================
    // 9. EXCEPTION HANDLING
    // =========================================

    public static void feature9() {

        System.out.println("\n\n9. EXCEPTION HANDLING");

        StudentValidator validator = new StudentValidator();

        System.out.println(
                "\nValidating student data:");

        try {

            validator.validateStudent(
                    102,
                    "Rahul",
                    "BCA");

        } catch (InvalidStudentDataException e) {

            System.out.println(
                    "Exception: " + e.getMessage());

        } finally {

            System.out.println(
                    "Student validation completed.");
        }

        System.out.println(
                "\nValidating invalid student data:");

        try {

            validator.validateStudent(
                    0,
                    "Rahul",
                    "BCA");

        } catch (InvalidStudentDataException e) {

            System.out.println(
                    "Exception: " + e.getMessage());

        } finally {

            System.out.println(
                    "Student validation completed.");
        }
    }

    // =========================================
    // 10. REFLECTION, PERSISTENCE, I/O,
    // RTTI & CLONING
    // =========================================

    public static void feature10(Scanner scanner) {

        System.out.println(
                "\n\n10. REFLECTION, PERSISTENCE, I/O, RTTI & CLONING");

        // Console I/O
        System.out.println("\nConsole I/O:");

        System.out.print("Enter student name: ");

        String consoleName = scanner.nextLine();

        System.out.println(
                "Student name: " + consoleName);

        // Student record
        ArrayList<String> activities = new ArrayList<>();

        activities.add("Technical Seminar");
        activities.add("Hackathon");
        activities.add("NIRF Awareness Program");

        StudentRecord record = new StudentRecord(
                102,
                "Rahul",
                "BCA",
                activities);

        // Reflection
        System.out.println("\nReflection:");

        Class<?> studentClass = record.getClass();

        System.out.println(
                "Class Name: "
                        + studentClass.getName());

        System.out.println(
                "Fields in StudentRecord:");

        Field[] fields = studentClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(
                    "- " + field.getName());
        }

        // RTTI
        System.out.println("\nRTTI:");

        if (record instanceof StudentRecord) {

            System.out.println(
                    "record is an object of StudentRecord.");
        }

        System.out.println(
                "Runtime Class: "
                        + record.getClass().getSimpleName());

        // File I/O
        System.out.println("\nFile I/O:");

        try {

            FileWriter writer = new FileWriter(
                    "student_report.txt");

            writer.write(
                    "DCST Student NIRF Record\n");

            writer.write(
                    "Student ID : 102\n");

            writer.write(
                    "Name       : Rahul\n");

            writer.write(
                    "Program    : BCA\n");

            writer.write(
                    "Activities : "
                            + activities + "\n");

            writer.close();

            System.out.println(
                    "Student report written to "
                            + "student_report.txt.");

            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            "student_report.txt"));

            String line;

            System.out.println(
                    "\nReading report from file:");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    "File error: "
                            + e.getMessage());
        }

        // Persistence
        System.out.println("\nPersistence:");

        try {

            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream(
                            "student_record.dat"));

            output.writeObject(record);
            output.close();

            System.out.println(
                    "Student record saved to "
                            + "student_record.dat.");

            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream(
                            "student_record.dat"));

            StudentRecord savedRecord = (StudentRecord) input.readObject();

            input.close();

            System.out.println(
                    "\nRecord loaded from file:");

            savedRecord.displayRecord();

        } catch (Exception e) {

            System.out.println(
                    "Persistence error: "
                            + e.getMessage());
        }

        // Shallow Cloning
        System.out.println("\nShallow Cloning:");

        try {

            StudentRecord shallowCopy = record.shallowClone();

            record.displayRecord();

            shallowCopy.addActivity(
                    "Coding Workshop");

            System.out.println(
                    "\nAfter changing shallow copy:");

            System.out.println("\nOriginal record:");
            record.displayRecord();

            System.out.println("\nShallow copy:");
            shallowCopy.displayRecord();

        } catch (CloneNotSupportedException e) {

            System.out.println(
                    "Cloning error: "
                            + e.getMessage());
        }

        // Deep Cloning
        System.out.println("\nDeep Cloning:");

        StudentRecord deepCopy = record.deepClone();

        deepCopy.addActivity(
                "Blockchain Seminar");

        System.out.println("\nOriginal record:");
        record.displayRecord();

        System.out.println("\nDeep copy:");
        deepCopy.displayRecord();
    }
}
