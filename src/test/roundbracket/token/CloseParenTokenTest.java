package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CloseParenTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        CloseParenToken token = new CloseParenToken();

        assertTrue(token.equals(new CloseParenToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        CloseParenToken token = new CloseParenToken();

        assertFalse(token.equals(new OpenParenToken()));
    }
}
