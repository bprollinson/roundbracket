package roundbracket.tokenizer;

import roundbracket.token.BoolIsSetToken;
import roundbracket.token.CharIsSetToken;
import roundbracket.token.CharToIntToken;
import roundbracket.token.CharToStringToken;
import roundbracket.token.CloseParenToken;
import roundbracket.token.EightToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FloatIsSetToken;
import roundbracket.token.FloatToStringToken;
import roundbracket.token.FourToken;
import roundbracket.token.GetBoolToken;
import roundbracket.token.GetCharToken;
import roundbracket.token.GetFloatToken;
import roundbracket.token.GetIntToken;
import roundbracket.token.GetStringToken;
import roundbracket.token.IntIsCharToken;
import roundbracket.token.IntIsSetToken;
import roundbracket.token.IntToCharToken;
import roundbracket.token.IntToFloatToken;
import roundbracket.token.IntToStringToken;
import roundbracket.token.NineToken;
import roundbracket.token.OneToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.SetBoolToken;
import roundbracket.token.SetCharToken;
import roundbracket.token.SetFloatToken;
import roundbracket.token.SetIntToken;
import roundbracket.token.SetStringToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SixToken;
import roundbracket.token.StringIsFloatToken;
import roundbracket.token.StringIsIntToken;
import roundbracket.token.StringIsSetToken;
import roundbracket.token.StringToFloatToken;
import roundbracket.token.StringToIntToken;
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

        this.parseMultiCharacterToken(buffer, tokenList);

        return tokenList;
    }

    private void parseMultiCharacterToken(String buffer, List<Token> tokenList)
    {
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
                case "ten":
                    tokenList.add(new TenToken());
                    break;
                case "get_bool":
                    tokenList.add(new GetBoolToken());
                    break;
                case "set_bool":
                    tokenList.add(new SetBoolToken());
                    break;
                case "bool_is_set":
                    tokenList.add(new BoolIsSetToken());
                    break;
                case "get_int":
                    tokenList.add(new GetIntToken());
                    break;
                case "set_int":
                    tokenList.add(new SetIntToken());
                    break;
                case "int_is_set":
                    tokenList.add(new IntIsSetToken());
                    break;
                case "get_float":
                    tokenList.add(new GetFloatToken());
                    break;
                case "set_float":
                    tokenList.add(new SetFloatToken());
                    break;
                case "float_is_set":
                    tokenList.add(new FloatIsSetToken());
                    break;
                case "get_char":
                    tokenList.add(new GetCharToken());
                    break;
                case "set_char":
                    tokenList.add(new SetCharToken());
                    break;
                case "char_is_set":
                    tokenList.add(new CharIsSetToken());
                    break;
                case "get_string":
                    tokenList.add(new GetStringToken());
                    break;
                case "set_string":
                    tokenList.add(new SetStringToken());
                    break;
                case "string_is_set":
                    tokenList.add(new StringIsSetToken());
                    break;
                case "int_to_float":
                    tokenList.add(new IntToFloatToken());
                    break;
                case "int_is_char":
                    tokenList.add(new IntIsCharToken());
                    break;
                case "int_to_char":
                    tokenList.add(new IntToCharToken());
                    break;
                case "int_to_string":
                    tokenList.add(new IntToStringToken());
                    break;
                case "float_to_string":
                    tokenList.add(new FloatToStringToken());
                    break;
                case "char_to_int":
                    tokenList.add(new CharToIntToken());
                    break;
                case "char_to_string":
                    tokenList.add(new CharToStringToken());
                    break;
                case "string_is_int":
                    tokenList.add(new StringIsIntToken());
                    break;
                case "string_to_int":
                    tokenList.add(new StringToIntToken());
                    break;
                case "string_is_float":
                    tokenList.add(new StringIsFloatToken());
                    break;
                default:
                    tokenList.add(new StringToFloatToken());
                    break;
            }
        }
    }
}
