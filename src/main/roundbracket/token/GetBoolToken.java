package roundbracket.token;

public class GetBoolToken implements Token
{
    public boolean equals(Object other)
    {
        return this.getClass().equals(other.getClass());
    }
}
