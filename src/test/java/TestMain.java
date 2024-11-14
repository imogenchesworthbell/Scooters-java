import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    private Main calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Main();  // Initialize the calculator instance
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiplying with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiplying with zero should be zero");
    }
}


