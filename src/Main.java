
public class Main {

public static void main(String... args) {

    ExamStatic exam = new ExamStatic();

    String str1 = exam.get();
    String str3 = exam.get("You are cool programmer");


    System.out.println(str1);
    System.out.println(str3);
    exam.get(8);



}

}









