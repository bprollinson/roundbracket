package roundbracket.token;

public class GetStringToken implements Token
{
    public boolean equals(Object other)
    {
        return this.getClass().equals(other.getClass());
    }
}
