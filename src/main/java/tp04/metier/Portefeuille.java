/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04.metier;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author perussel
 */
public class Portefeuille {
    //Liste des action du portefeuille
    Map<Action, LignePortefeuille> mapLignes;
    
    private class LignePortefeuille {
        //Parametres de la classe LignePortefeuille
        private Action action;
        
        private int qte;
        // Methodes GET & SET 
        public int getQte() {
            return qte;
        }
        
        public void setQte(int qte) {
            this.qte = qte;
        }
        
        public Action getAction() {
            return this.action;
        }
        //Constructeur de la classe LignePortefeuille
        public LignePortefeuille(Action action, int qte) {
            this.action = action;
            this.qte = qte;
        }
        //Methode toString() 
        public String toString() {
            return Integer.toString(qte);
        }
    }
    //Methode de la classe Portefeuille
    public Portefeuille() {
        this.mapLignes = new HashMap();
    }
    
    //Methode d'achat d'une action
    public void acheter(Action a, int q) {
        if (q <= 0){
          System.out.println("on ne peut pas acheter de quantités négatives");
        }
        else if (this.mapLignes.containsKey(a) == false) {
            this.mapLignes.put(a, new LignePortefeuille(a, q));
        } else {
            this.mapLignes.get(a).setQte(this.mapLignes.get(a).getQte() + q);
        }
    }

    // méthode permettant de vendre une action
    public void vendre(Action a, int q) {
        if (this.mapLignes.containsKey(a) == true) {
            if (this.mapLignes.get(a).getQte() > q) {
                this.mapLignes.get(a).setQte(this.mapLignes.get(a).getQte() - q);
            } 
            else if (this.mapLignes.get(a).getQte() == q) {
                this.mapLignes.remove(a);  
            }
            else{
              System.out.println("on ne peut pas vendre plus que la quantité achetée");
            }
        }        
    }
    //Methode toString()
    public String toString() {
        return this.mapLignes.toString();
    }
    
    //Methode qui permet d'obtenir la valeur du portefeuille à un jour donnée
    public float valeur(Jour j) {
        float total = 0;
        for (LignePortefeuille lp : this.mapLignes.values()) {
            total = total + (lp.getQte() * lp.getAction().valeur(j));
        }
        return total;
    }
}
