package com.fges.tp_solid.reigns;

public class AfficherJauges {

    public static void AfficheJauges(){
        afficheJauge(Personnage.jaugeClerge);
        afficheJauge(Personnage.jaugePeuple);
        afficheJauge(Personnage.jaugeArmee);
        afficheJauge(Personnage.jaugeFinance);
        System.out.flush();
    }


    private static void afficheJauge(Jauge jauge){
        String resultat = "[";
        // valeur : ####
        for(int i=0;i<jauge.getValeur();i++){
            resultat += "#";
        }
        // on complète avec ____
        for(int i=0;i<50-(jauge.getValeur()>0?jauge.getValeur():0);i++){
            resultat += "_";
        }
        resultat += "] ";
        // affichage du nom
        resultat += jauge.getNom();
        System.out.println(resultat);
    }

}
