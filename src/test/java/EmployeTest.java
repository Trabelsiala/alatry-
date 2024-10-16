import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tn.esprit.spring.entities.Employe; // Assurez-vous que le chemin est correct
import tn.esprit.spring.entities.Role; // Assurez-vous que le chemin est correct

public class EmployeTest {
    private Employe employe;

    @BeforeEach
    public void setUp() {
        // Initialiser un employé avant chaque test
        employe = new Employe("Dupont", "Jean", "jean.dupont@example.com", "password123", true, Role.ADMINISTRATEUR);
    }

    @Test
    public void testEstActif() {
        // Vérifie que l'employé est actif
        assertTrue(employe.isActif());

        // Désactiver l'employé et vérifier à nouveau
        employe.setActif(false);
        assertFalse(employe.isActif());
    }

    @Test
    public void testChangerRole() {
        // Change le rôle de l'employé et vérifie
        employe.setRole(Role.INGENIEUR); // Changer le rôle à INGENIEUR
        assertTrue(employe.getRole() == Role.INGENIEUR);
    }
}
