package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MultiplyIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        MultiplyIntToken token = new MultiplyIntToken();

        assertTrue(token.equals(new MultiplyIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        MultiplyIntToken token = new MultiplyIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
