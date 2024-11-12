package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IntIsSetTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        IntIsSetToken token = new IntIsSetToken();

        assertTrue(token.equals(new IntIsSetToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        IntIsSetToken token = new IntIsSetToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
