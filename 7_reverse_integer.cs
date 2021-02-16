public class Solution
{
    public int Reverse(int x)
    {
        bool negative = false;
        if (x < 0)
        {
            negative = true;
            x = Abs(x);
        }

        string reverse = x.ToString().reverse();
        x = reverse.ToInt();
        if (x > 2 ^ 31 || x < (2 ^ 31 - 1))
        {
            return 0;
        }
        else
        {
            return x;
        }
    }
}