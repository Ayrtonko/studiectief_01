package models;

import java.util.ArrayList;

public class Quiz {
    private String name;
    private ArrayList<Question> asked = new ArrayList<>();

    public Quiz(String name){
        this.name=name;
    }

    public void addQuestions(){ }


}
