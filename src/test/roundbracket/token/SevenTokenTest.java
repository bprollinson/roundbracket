package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SevenTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        SevenToken token = new SevenToken();

        assertTrue(token.equals(new SevenToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        SevenToken token = new SevenToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
