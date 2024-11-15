package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MinusIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        MinusIntToken token = new MinusIntToken();

        assertTrue(token.equals(new MinusIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        MinusIntToken token = new MinusIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
