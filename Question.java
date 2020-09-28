package ee.taltech.vk.sabenin.app1;

public class Question {
    int id;
    String question;
    String[] answers;
    String trueAnswer;
    String capitalImage;


    public Question(int id, String question, String[] answers, String trueAnswer, String capitalImage) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.trueAnswer = trueAnswer;
        this.capitalImage = capitalImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getCapitalImage() {
        return capitalImage;
    }

    public void setCapitalImage(String capitalImage) {
        this.capitalImage = capitalImage;
    }
}
