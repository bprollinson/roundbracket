package roundbracket.tokenizer;

import roundbracket.token.CloseParenToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.Token;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer
{
    private MultiCharacterTokenFactory tokenFactory;

    public Tokenizer()
    {
        this.tokenFactory = new MultiCharacterTokenFactory();
    }

    public List<Token> tokenize(String input)
    {
        List<Token> tokenList = new ArrayList<Token>();
        int inputLength = input.length();

        String buffer = "";

        for (int i = 0; i < inputLength; i++)
        {
            char character = input.charAt(i);
            if (character == '(')
            {
                this.parseMultiCharacterToken(buffer, tokenList);
                buffer = "";
                tokenList.add(new OpenParenToken());
            }
            else if (character == ')')
            {
                this.parseMultiCharacterToken(buffer, tokenList);
                buffer = "";
                tokenList.add(new CloseParenToken());
            }
            else if (this.characterIsWhitespace(character))
            {
                this.parseMultiCharacterToken(buffer, tokenList);
                buffer = "";
            }
            else
            {
                buffer += character;
            }
        }

        this.parseMultiCharacterToken(buffer, tokenList);

        return tokenList;
    }

    private boolean characterIsWhitespace(char character)
    {
        return character == ' ' || character == '\t' || character == '\r' || character == '\n';
    }

    private void parseMultiCharacterToken(String buffer, List<Token> tokenList)
    {
        if (buffer.length() > 0)
        {
            Token token = this.tokenFactory.createToken(buffer);
            tokenList.add(token);
        }
    }
}
