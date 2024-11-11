package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TenTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        TenToken token = new TenToken();

        assertTrue(token.equals(new TenToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        TenToken token = new TenToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
