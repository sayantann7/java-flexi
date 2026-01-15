import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    String[] answers = new String[5];
    int index = 0;

    public QuestionService() {
        String[] options1 = {"1","2","4","8"};
        String[] options2 = {"1","2","4","8"};
        String[] options3 = {"1","2","4","8"};
        String[] options4 = {"1","2","4","8"};
        String[] options5 = {"1","2","4","8"};
        questions[0] = new Question(1, "What is the size of int", options1, "2");
        questions[1] = new Question(2, "What is the size of char", options2, "1");
        questions[2] = new Question(3, "What is the size of long", options3, "4");
        questions[3] = new Question(4, "What is the size of boolean", options4, "1");
        questions[4] = new Question(5, "What is the size of double", options5, "3");
    }

    public void playQuiz(){
        for(Question q : questions){
            System.out.println("Question no. "+q.getID()+" : ");
            System.out.println(q.getQues());
            for(String option : q.getOptions()){
                System.out.println(option);
            }
            System.out.print("Enter your answer : ");
            Scanner sc = new Scanner(System.in);
            String selectedOption = sc.nextLine();
            answers[index++] = selectedOption;
        }
        System.out.println("Your selected answers : ");
        for(String answer : answers){
            System.out.println(answer);
        }
    }

    int i = 0;
    public void printScore(){
        int score = 0;
        for(Question q : questions){
            String correctAns = answers[i++];
            String userAns = q.getAnswer();
            if(correctAns.equals(userAns)){
                score += 1;
            }
        }
        System.out.println("Your final score is : "+score);
    }
}
