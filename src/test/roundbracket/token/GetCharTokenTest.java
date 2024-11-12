package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GetCharTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        GetCharToken token = new GetCharToken();

        assertTrue(token.equals(new GetCharToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        GetCharToken token = new GetCharToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
