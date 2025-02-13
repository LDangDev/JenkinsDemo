import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void add() {
        assert 2 == new Cal().add(1, 1);
    }

    @Test
    void subtract() {
        assert 0 == new Cal().subtract(1, 1);
    }

    @Test
    void multiply() {
        assert 1 == new Cal().multiply(1, 1);
    }

    @Test
    void divide() {
        assert 1 == new Cal().divide(1, 1);
    }
}