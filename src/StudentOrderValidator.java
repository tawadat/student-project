public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
    StudentOrder so = readStudentOrder();

    AnswerCityRegister cityAnswer = checkCitiRegister(so);
    AnswerWedding wedAnswer = checkWedding(so);
    AnswerChildren childAnswer = checkChildren(so);
    AnswerStudent studentAnswer = checkStudent(so);

    sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;

    }

    static AnswerCityRegister checkCitiRegister(StudentOrder so) {
        System.out.println("CitiRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Запущен");
        return new AnswerWedding();
    }
    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is running");
        return new AnswerChildren();
    }
    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
    static void sendMail(StudentOrder so){

    }
}
