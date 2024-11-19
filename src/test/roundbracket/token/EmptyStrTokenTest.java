package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EmptyStrTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        EmptyStrToken token = new EmptyStrToken();

        assertTrue(token.equals(new EmptyStrToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        EmptyStrToken token = new EmptyStrToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
