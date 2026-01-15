public class Question {
    private int id;
    private String ques;
    private String options[];
    private String answer;

    public Question(int id, String ques, String[] options, String answer){
        this.id = id;
        this.ques = ques;
        this.options = options;
        this.answer = answer;
    }

    public int getID(){
        return id;
    }
    public String getQues(){
        return ques;
    }
    public String[] getOptions(){
        return options;
    }
    public String getAnswer(){
        return answer;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setQues(String ques) {
        this.ques = ques;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
