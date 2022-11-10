import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main = new Main();

    @Test
    void additional() {
        assertEquals(16, main.add(64, 2));
    }
}
