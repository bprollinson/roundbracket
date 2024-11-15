package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SubtractIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        SubtractIntToken token = new SubtractIntToken();

        assertTrue(token.equals(new SubtractIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        SubtractIntToken token = new SubtractIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
