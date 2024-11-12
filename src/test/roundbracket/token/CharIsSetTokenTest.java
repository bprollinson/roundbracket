package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CharIsSetTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        CharIsSetToken token = new CharIsSetToken();

        assertTrue(token.equals(new CharIsSetToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        CharIsSetToken token = new CharIsSetToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
