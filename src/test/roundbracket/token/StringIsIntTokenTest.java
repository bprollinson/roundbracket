package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringIsIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        StringIsIntToken token = new StringIsIntToken();

        assertTrue(token.equals(new StringIsIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        StringIsIntToken token = new StringIsIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
