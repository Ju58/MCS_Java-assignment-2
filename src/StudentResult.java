public class StudentResult {
    private static boolean passed;

    public static void main(String[] args){
        String studentName;
        studentName = "Juliet Julie";
        //System.out.println(studentName);

        int age;
        age = 20;
        //System.out.println(age);

        double grade;
        grade = 40.0;
        //System.out.println(grade);

        boolean hasPassed = true;
        //System.out.println(hasPassed);
        boolean passed = checkExamResult(grade);
        System.out.println(passed);
    }public static boolean checkExamResult(double grade) {
        if (passed) {
            System.out.println("congratulations, " + "Juliet Julie, " + "you passed the exam!");
        } else {
            System.out.println("sorry, " + "Juliet Julie, " + "you failed the exam. study hard");
        }
        return false;
    }
}
