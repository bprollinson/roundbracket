package roundbracket.token;

public class GetFloatToken implements Token
{
    public boolean equals(Object other)
    {
        return this.getClass().equals(other.getClass());
    }
}
