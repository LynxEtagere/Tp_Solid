package com.fges.tp_solid.reigns;

import java.util.ArrayList;

public class QuestionCondition extends Jeu {
        public static void InitQuestionCondition(){
            if (Personnage.getJaugeFinance().getValeur() < 10) {
                Question question6 = new Question(
                        "Main du roi",
                        "Les caisses sont vides...",
                        "Augmenter les taxes",
                        "emprunter");
                question6.ajouteEffetGauche(TypeJauge.FINANCE, +10);
                question6.ajouteEffetGauche(TypeJauge.PEUPLE, -5);
                question6.ajouteEffetDroite(TypeJauge.FINANCE, +7);
                question6.ajouteEffetDroite(TypeJauge.PEUPLE, -3);
                questions.add(question6);
            } else if (Personnage.getJaugeClerge().getValeur() < 10 & Personnage.getJaugeFinance().getValeur() > 30) {
                Question question7 = new Question(
                        "Main du roi",
                        "J'aimerais qu'on nous considère en tant que tel",
                        "construire des monastères",
                        "écouter sans rien faire");
                question7.ajouteEffetGauche(TypeJauge.CLERGE, +5);
                question7.ajouteEffetGauche(TypeJauge.FINANCE, -5);
                question7.ajouteEffetDroite(TypeJauge.CLERGE, -5);
                questions.add(question7);
            }
        }
    }