package roundbracket.tokenizer;

import roundbracket.token.OpenParenToken;
import roundbracket.token.Token;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer
{
    public List<Token> tokenize(String input)
    {
        List<Token> tokenList = new ArrayList<Token>();
        tokenList.add(new OpenParenToken());

        return tokenList;
    }
}
