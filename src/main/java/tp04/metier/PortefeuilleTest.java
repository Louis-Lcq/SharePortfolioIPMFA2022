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
    
    ActionSimple a1 = new ActionSimple("Apple");
    ActionSimple a2 = new ActionSimple("Microsoft");
    
    Portefeuille p1 = new Portefeuille();
    
    p1.acheter(a1, 5);
    p1.acheter(a2, 10);
    
    p1.vendre(a1, 2);
    
    System.out.println("La valeur du portefeuille est " + p1.valeur(1));
  }
}
