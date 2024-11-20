package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IfTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        IfToken token = new IfToken();

        assertTrue(token.equals(new IfToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        IfToken token = new IfToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
