package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class NotTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        NotToken token = new NotToken();

        assertTrue(token.equals(new NotToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        NotToken token = new NotToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
