package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CharToStringTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        CharToStringToken token = new CharToStringToken();

        assertTrue(token.equals(new CharToStringToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        CharToStringToken token = new CharToStringToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
