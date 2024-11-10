package roundbracket.tokenizer;

import roundbracket.token.CloseParenToken;
import roundbracket.token.EightToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FourToken;
import roundbracket.token.NineToken;
import roundbracket.token.OneToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SixToken;
import roundbracket.token.TenToken;
import roundbracket.token.ThreeToken;
import roundbracket.token.Token;
import roundbracket.token.TrueToken;
import roundbracket.token.TwoToken;
import roundbracket.token.ZeroToken;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer
{
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
                tokenList.add(new OpenParenToken());
            }
            else if (character == ')')
            {
                tokenList.add(new CloseParenToken());
            }
            else
            {
                buffer += character;
            }
        }

        if (buffer.length() > 0)
        {
            switch (buffer)
            {
                case "false":
                    tokenList.add(new FalseToken());
                    break;
                case "true":
                    tokenList.add(new TrueToken());
                    break;
                case "zero":
                    tokenList.add(new ZeroToken());
                    break;
                case "one":
                    tokenList.add(new OneToken());
                    break;
                case "two":
                    tokenList.add(new TwoToken());
                    break;
                case "three":
                    tokenList.add(new ThreeToken());
                    break;
                case "four":
                    tokenList.add(new FourToken());
                    break;
                case "five":
                    tokenList.add(new FiveToken());
                    break;
                case "six":
                    tokenList.add(new SixToken());
                    break;
                case "seven":
                    tokenList.add(new SevenToken());
                    break;
                case "eight":
                    tokenList.add(new EightToken());
                    break;
                case "nine":
                    tokenList.add(new NineToken());
                    break;
                default:
                    tokenList.add(new TenToken());
                    break;
            }
        }

        return tokenList;
    }
}
