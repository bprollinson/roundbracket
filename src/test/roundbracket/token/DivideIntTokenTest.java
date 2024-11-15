package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DivideIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        DivideIntToken token = new DivideIntToken();

        assertTrue(token.equals(new DivideIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        DivideIntToken token = new DivideIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
