package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MinusFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        MinusFloatToken token = new MinusFloatToken();

        assertTrue(token.equals(new MinusFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        MinusFloatToken token = new MinusFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
