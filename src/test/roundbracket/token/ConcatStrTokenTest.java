package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ConcatStrTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        ConcatStrToken token = new ConcatStrToken();

        assertTrue(token.equals(new ConcatStrToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        ConcatStrToken token = new ConcatStrToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
