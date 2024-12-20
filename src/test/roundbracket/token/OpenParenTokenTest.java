package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OpenParenTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        OpenParenToken token = new OpenParenToken();

        assertTrue(token.equals(new OpenParenToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        OpenParenToken token = new OpenParenToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
