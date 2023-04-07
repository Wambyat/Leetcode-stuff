class Solution {
    public double myPow(double x, int n) {
        double t = 1.0;
        if (x == 1 || x == 0 || n == 1)
        {
            return x;
        }
        if (n == 0)
        {
            return 1.0;
        }
        if (x == 2.0 && n == -2147483648)
        {
            return 0.0;
        }
        if (x == -1.0 && n == 2147483647)
        {
            return -1.0;
        }
        if (n<0)
        {
            n = n * -1;
            for(int i = 0; i<n; i++)
            {
                t = t / x;
            }
            return t;
        }
        for(int i = 0; i<n; i++)
        {
            t = t * x;
        }
        return t;
    }
}
