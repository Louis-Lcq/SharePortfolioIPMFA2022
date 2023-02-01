/*
 * Copyright 2023 louis.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tp04.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author louis
 */
public class PortefeuilleTest {

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
    
    //achat d'action dans le portefeuille
    p1.acheter(a1, 5);
    p1.acheter(a2, 10);
    
    
    //Vente d'action dans le portefeuille
    p1.vendre(a1, 2);
    
    //Enregistrer un cours
    System.out.println("La valeur de l'action simple "+ a1.getLibelle()+ " est de : " + a1.valeur(j1)+ " au jour :" + j1.getNoJour());
    System.out.println("la valeur de l'action simple "+ a2.getLibelle()+ " est de : " + p1.valeur(j2) +" au jour :" + j2.getNoJour());
            
  }
}
