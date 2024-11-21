package roundbracket.tokenizer;

import roundbracket.token.AddFloatToken;
import roundbracket.token.AddIntToken;
import roundbracket.token.AndToken;
import roundbracket.token.BoolIsSetToken;
import roundbracket.token.CeilingToken;
import roundbracket.token.CharIsSetToken;
import roundbracket.token.CharToIntToken;
import roundbracket.token.CharToStringToken;
import roundbracket.token.ConcatCharToken;
import roundbracket.token.ConcatStrToken;
import roundbracket.token.CloseParenToken;
import roundbracket.token.DivideFloatToken;
import roundbracket.token.DivideIntToken;
import roundbracket.token.EightToken;
import roundbracket.token.ElseIfToken;
import roundbracket.token.ElseToken;
import roundbracket.token.EmptyStrToken;
import roundbracket.token.EndIfToken;
import roundbracket.token.EndWhileToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FloatIsSetToken;
import roundbracket.token.FloatToStringToken;
import roundbracket.token.FloorToken;
import roundbracket.token.FourToken;
import roundbracket.token.GetBoolToken;
import roundbracket.token.GetCharToken;
import roundbracket.token.GetFloatToken;
import roundbracket.token.GetIntToken;
import roundbracket.token.GetStringToken;
import roundbracket.token.IfToken;
import roundbracket.token.IntIsCharToken;
import roundbracket.token.IntIsSetToken;
import roundbracket.token.IntToCharToken;
import roundbracket.token.IntToFloatToken;
import roundbracket.token.IntToStringToken;
import roundbracket.token.MinusFloatToken;
import roundbracket.token.MinusIntToken;
import roundbracket.token.ModIntToken;
import roundbracket.token.MultiplyFloatToken;
import roundbracket.token.MultiplyIntToken;
import roundbracket.token.NineToken;
import roundbracket.token.NotToken;
import roundbracket.token.OneToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.OrToken;
import roundbracket.token.PrintStringToken;
import roundbracket.token.ReadStringToken;
import roundbracket.token.RoundToken;
import roundbracket.token.SetBoolToken;
import roundbracket.token.SetCharToken;
import roundbracket.token.SetFloatToken;
import roundbracket.token.SetIntToken;
import roundbracket.token.SetStringToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SixToken;
import roundbracket.token.StrCharToken;
import roundbracket.token.StringIsFloatToken;
import roundbracket.token.StringIsIntToken;
import roundbracket.token.StringIsSetToken;
import roundbracket.token.StringToFloatToken;
import roundbracket.token.StringToIntToken;
import roundbracket.token.StrLengthToken;
import roundbracket.token.SubtractFloatToken;
import roundbracket.token.SubtractIntToken;
import roundbracket.token.TenToken;
import roundbracket.token.ThreeToken;
import roundbracket.token.Token;
import roundbracket.token.TrueToken;
import roundbracket.token.TwoToken;
import roundbracket.token.WhileToken;
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
                case "string_to_float":
                    tokenList.add(new StringToFloatToken());
                    break;
                case "and":
                    tokenList.add(new AndToken());
                    break;
                case "or":
                    tokenList.add(new OrToken());
                    break;
                case "not":
                    tokenList.add(new NotToken());
                    break;
                case "minus_int":
                    tokenList.add(new MinusIntToken());
                    break;
                case "add_int":
                    tokenList.add(new AddIntToken());
                    break;
                case "subtract_int":
                    tokenList.add(new SubtractIntToken());
                    break;
                case "multiply_int":
                    tokenList.add(new MultiplyIntToken());
                    break;
                case "divide_int":
                    tokenList.add(new DivideIntToken());
                    break;
                case "mod_int":
                    tokenList.add(new ModIntToken());
                    break;
                case "minus_float":
                    tokenList.add(new MinusFloatToken());
                    break;
                case "add_float":
                    tokenList.add(new AddFloatToken());
                    break;
                case "subtract_float":
                    tokenList.add(new SubtractFloatToken());
                    break;
                case "multiply_float":
                    tokenList.add(new MultiplyFloatToken());
                    break;
                case "divide_float":
                    tokenList.add(new DivideFloatToken());
                    break;
                case "floor":
                    tokenList.add(new FloorToken());
                    break;
                case "round":
                    tokenList.add(new RoundToken());
                    break;
                case "ceiling":
                    tokenList.add(new CeilingToken());
                    break;
                case "empty_str":
                    tokenList.add(new EmptyStrToken());
                    break;
                case "str_length":
                    tokenList.add(new StrLengthToken());
                    break;
                case "concat_str":
                    tokenList.add(new ConcatStrToken());
                    break;
                case "concat_char":
                    tokenList.add(new ConcatCharToken());
                    break;
                case "str_char":
                    tokenList.add(new StrCharToken());
                    break;
                case "if":
                    tokenList.add(new IfToken());
                    break;
                case "else_if":
                    tokenList.add(new ElseIfToken());
                    break;
                case "else":
                    tokenList.add(new ElseToken());
                    break;
                case "end_if":
                    tokenList.add(new EndIfToken());
                    break;
                case "while":
                    tokenList.add(new WhileToken());
                    break;
                case "end_while":
                    tokenList.add(new EndWhileToken());
                    break;
                case "print_string":
                    tokenList.add(new PrintStringToken());
                    break;
                 case "read_string":
                    tokenList.add(new ReadStringToken());
                    break;
            }
        }
    }
}
