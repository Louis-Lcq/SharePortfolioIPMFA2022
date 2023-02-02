    package tp04.metier;
    import org.junit.jupiter.api.Test;
  
  import static org.junit.jupiter.api.Assertions.

  *;

/**
 *
 * @author louis
 */
public class PortefeuilleTest {

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {

    }


    @Test
    public void AcheterShouldPass() {
    Jour j1 = new Jour(2023, 20);
    Portefeuille p1 = new Portefeuille();
    ActionSimple a1 = new ActionSimple("Apple");
      a1.enrgCours(j1, 5f);
      p1.acheter(a1, 1);

      assertEquals(5, p1.valeur(j1));
    }
    
    @Test
    public void AcheterShouldNotPass(){
      Jour j1 = new Jour(2023, 20);
      Portefeuille p1 = new Portefeuille();
      ActionSimple a1 = new ActionSimple("Apple");            
      a1.enrgCours(j1, 5f);
      p1.acheter(a1, -10);
      assertNotEquals(-50, p1.valeur(j1));      
    }
    
    @Test
    public void VendreEqualsShouldPass() {
      Jour j1 = new Jour(2023, 20);
      Portefeuille p1 = new Portefeuille();
      ActionSimple a1 = new ActionSimple("Apple");      
      a1.enrgCours(j1, 5f);
      p1.acheter(a1, 1);
      p1.vendre(a1, 1);

      assertEquals(0, p1.valeur(j1));
    }
    

  }
