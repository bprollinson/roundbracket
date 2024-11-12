package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringIsSetTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        StringIsSetToken token = new StringIsSetToken();

        assertTrue(token.equals(new StringIsSetToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        StringIsSetToken token = new StringIsSetToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
