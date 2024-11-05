package roundbracket.tokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import roundbracket.token.Token;

import java.util.List;

public class TokenizerTest
{
    @Test
    public void testTokenizeTokenizesOpenParenthesis()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("(");

        assertEquals(1, tokens.size());
    }
}
