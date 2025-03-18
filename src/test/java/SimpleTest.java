import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void testAddition() {
        // Code que l'on veut tester
        int result = 2 + 2;
        // Vérification que le résultat attendu est bien celui qu'on obtient
        assertEquals(4, result, "2 + 2 should be 4");
    }
}