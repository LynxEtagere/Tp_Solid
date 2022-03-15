package com.fges.tp_solid.reigns;

public class getQuestionAleatoire extends  Jeu {
    public static Question getQuestionAleatoire(){
        int numQuestion = (int) (Math.random()*Jeu.questions.size());
        return Jeu.questions.get(numQuestion);
    }
}
//ite