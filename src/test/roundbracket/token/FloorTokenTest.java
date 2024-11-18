package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FloorTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        FloorToken token = new FloorToken();

        assertTrue(token.equals(new FloorToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        FloorToken token = new FloorToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
