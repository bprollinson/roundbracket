package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class WhileTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        WhileToken token = new WhileToken();

        assertTrue(token.equals(new WhileToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        WhileToken token = new WhileToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
