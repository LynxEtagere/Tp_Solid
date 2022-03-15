/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fges.tp_solid.reigns;


/**
 *
 * @author julie.jacques
 */
public class Personnage {
    
    protected String nom;
    protected Genre genre;
    
    protected static Jauge jaugeClerge;
    protected static Jauge jaugePeuple;
    protected static Jauge jaugeArmee;
    protected static Jauge jaugeFinance;
    
    public Personnage(String nom, Genre genre){
        this.nom = nom;
        this.genre = genre;
        
        // initialisation des jauges entre 15 et 35 points
        jaugeClerge = new Jauge("Clergé",(int) (15 + Math.random() * ( 35 - 15 )));
        jaugePeuple = new Jauge("Peuple",(int) (15 + Math.random() * ( 35 - 15 )));
        jaugeArmee = new Jauge("Armée",(int) (15 + Math.random() * ( 35 - 15 )));
        jaugeFinance = new Jauge("Finance",(int) (15 + Math.random() * ( 35 - 15 )));
    }
    
    /**
     * Le jeu s'arrête si une des jauges atteint 0 ou 50
     * @return 
     */
    public boolean finDuJeu(){
        if(jaugeClerge.getValeur()<=0
        || jaugeClerge.getValeur()>=50
        || jaugePeuple.getValeur()<=0
        || jaugePeuple.getValeur()>=50
        || jaugeArmee.getValeur()<=0
        || jaugeArmee.getValeur()>=50
        || jaugeFinance.getValeur()<=0
        || jaugeFinance.getValeur()>=50){
            return true;
        }else{
            return false;
        }
    }
    


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public static Jauge getJaugeClerge() {
        return jaugeClerge;
    }

    public void setJaugeClerge(Jauge jaugeClerge) {
        this.jaugeClerge = jaugeClerge;
    }

    public Jauge getJaugePeuple() {
        return jaugePeuple;
    }

    public void setJaugePeuple(Jauge jaugePeuple) {
        this.jaugePeuple = jaugePeuple;
    }

    public Jauge getJaugeArmee() {
        return jaugeArmee;
    }

    public void setJaugeArmee(Jauge jaugeArmee) {
        this.jaugeArmee = jaugeArmee;
    }

    public static Jauge getJaugeFinance() {
        return jaugeFinance;
    }

    public void setJaugeFinance(Jauge jaugeFinance) {
        this.jaugeFinance = jaugeFinance;
    }
    
}
