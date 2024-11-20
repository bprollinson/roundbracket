package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ElseTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        ElseToken token = new ElseToken();

        assertTrue(token.equals(new ElseToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        ElseToken token = new ElseToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
