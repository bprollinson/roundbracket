package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OneTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        OneToken token = new OneToken();

        assertTrue(token.equals(new OneToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        OneToken token = new OneToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
