package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OpenParenTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        OpenParenToken token = new OpenParenToken();

        assertTrue(token.equals(new OpenParenToken()));
    }
}
