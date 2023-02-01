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
    Jour j1 = new Jour(2023, 20);
    Portefeuille p1 = new Portefeuille();
    ActionSimple a1 = new ActionSimple("Apple");

    @Test
    public void AcheterShouldPass() {
      a1.enrgCours(j1, 5f);
      p1.acheter(a1, 1);

      assertEquals(5, p1.valeur(j1));
    }

  }
