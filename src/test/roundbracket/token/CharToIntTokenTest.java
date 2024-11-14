package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CharToIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        CharToIntToken token = new CharToIntToken();

        assertTrue(token.equals(new CharToIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        CharToIntToken token = new CharToIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
