package roundbracket.tokenizer;

import roundbracket.token.CloseParenToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.Token;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer
{
    public List<Token> tokenize(String input)
    {
        List<Token> tokenList = new ArrayList<Token>();
        if (input.equals("("))
        {
            tokenList.add(new OpenParenToken());
        }
        else
        {
            tokenList.add(new CloseParenToken());
        }

        return tokenList;
    }
}
