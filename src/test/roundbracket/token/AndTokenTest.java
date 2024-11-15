package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AndTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        AndToken token = new AndToken();

        assertTrue(token.equals(new AndToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        AndToken token = new AndToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
