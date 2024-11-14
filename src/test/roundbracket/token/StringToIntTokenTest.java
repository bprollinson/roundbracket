package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringToIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        StringToIntToken token = new StringToIntToken();

        assertTrue(token.equals(new StringToIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        StringToIntToken token = new StringToIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
