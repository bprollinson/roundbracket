package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TwoTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        TwoToken token = new TwoToken();

        assertTrue(token.equals(new TwoToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        TwoToken token = new TwoToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
