package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SixTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        SixToken token = new SixToken();

        assertTrue(token.equals(new SixToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        SixToken token = new SixToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
