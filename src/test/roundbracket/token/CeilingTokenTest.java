package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CeilingTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        CeilingToken token = new CeilingToken();

        assertTrue(token.equals(new CeilingToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        CeilingToken token = new CeilingToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
