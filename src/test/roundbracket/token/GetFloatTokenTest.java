package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GetFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        GetFloatToken token = new GetFloatToken();

        assertTrue(token.equals(new GetFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        GetFloatToken token = new GetFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
