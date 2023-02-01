/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tp04.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author louis
 */
public class ActionSimpleTest {
    
    public ActionSimpleTest() {
      
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
    }
    public static void main (String[] args){
    
    //Declaration de jour
    Jour j1= new Jour(2023,20);
    Jour j2= new Jour(2023,12);
    
    // Declaration d'action simple
    ActionSimple a1 = new ActionSimple("Apple");
    ActionSimple a2 = new ActionSimple("Microsoft");
    
    //declaration de portefeuille
    Portefeuille p1 = new Portefeuille();
    
    //Enregistrer un cours
    a1.enrgCours(j2, 14.5f);
    a2.enrgCours(j1, 18.5f);
    a1.enrgCours(j1, 18.5f);
    a2.enrgCours(j2, 14.5f);
    }
}
