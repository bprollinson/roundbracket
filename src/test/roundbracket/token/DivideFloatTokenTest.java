package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DivideFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        DivideFloatToken token = new DivideFloatToken();

        assertTrue(token.equals(new DivideFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        DivideFloatToken token = new DivideFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
