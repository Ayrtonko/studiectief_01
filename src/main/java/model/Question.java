package model;

public class Question {
    private String question;

    public Question(String question){
        this.question = question;
    }

    public static void addToQuestionList(){
        Schedule.addAsked(new Question("what's the name of your schedule?"));
        Schedule.addAsked(new Question("how much time do you require to complete the schedule?"));
        Schedule.addAsked(new Question("on what day would you like to study?"));
    }

    public String toString(){
        return this.question;
    }

}
