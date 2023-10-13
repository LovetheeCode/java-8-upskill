package day1_generic.student;

public class Institution {

    public static void main(String[] args) {

        Batch b5 = new Batch("B5"); // --> just made a new ArrayList
        b5.addStudent(new SdetStudent("Eren"));
        b5.addStudent(new SdetStudent("Salma"));
        b5.addStudent(new SdetStudent("Eduard"));
        b5.addStudent(new SdetStudent("Svitlana"));
        b5.addStudent(new DevStudent("James"));
        b5.addStudent(new DevStudent("Anna"));
        b5.addStudent(new CyberSecurityStudent("Paul"));


        Batch<SdetStudent> b6 = new Batch<>("B6");
        b6.addStudent(new SdetStudent("Eren"));
        b6.addStudent(new SdetStudent("Salma"));
        b6.addStudent(new SdetStudent("Eduard"));
        b6.addStudent(new SdetStudent("Svitlana"));

        Batch<CyberSecurityStudent> cB6 = new Batch<>("B6");
        cB6.addStudent(new CyberSecurityStudent("Jen"));
        cB6.addStudent(new CyberSecurityStudent("Lena"));

        // these two do not work after adding <B extends Student> because now only SUB CLASSES of Student can be defined as the generic type
//        Batch<String> a;
//        Batch<Integer> b;



    }
}
