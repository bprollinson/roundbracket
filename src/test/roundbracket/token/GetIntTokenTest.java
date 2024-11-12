package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GetIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        GetIntToken token = new GetIntToken();

        assertTrue(token.equals(new GetIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        GetIntToken token = new GetIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
