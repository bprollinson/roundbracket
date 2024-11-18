package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SubtractFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        SubtractFloatToken token = new SubtractFloatToken();

        assertTrue(token.equals(new SubtractFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        SubtractFloatToken token = new SubtractFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
