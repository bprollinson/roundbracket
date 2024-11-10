package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ThreeTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        ThreeToken token = new ThreeToken();

        assertTrue(token.equals(new ThreeToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        ThreeToken token = new ThreeToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
