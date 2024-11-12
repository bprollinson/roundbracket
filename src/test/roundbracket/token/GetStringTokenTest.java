package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GetStringTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        GetStringToken token = new GetStringToken();

        assertTrue(token.equals(new GetStringToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        GetStringToken token = new GetStringToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
