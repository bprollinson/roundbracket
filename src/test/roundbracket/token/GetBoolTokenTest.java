package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GetBoolTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        GetBoolToken token = new GetBoolToken();

        assertTrue(token.equals(new GetBoolToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        GetBoolToken token = new GetBoolToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
