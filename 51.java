import java.util.*;
// ignore me testing :)
class Solution {
    public List< List<String> > solveNQueens(int n) {
        List< List<String> > a = new ArrayList<>();
        if (n == 3)
        {
            return a;
        }
        else if(n == 1)
        {
            List<String> inner = new ArrayList<>();
            inner.add("Q");
            a.add(inner);
        }
        List< List<String> > re = new ArrayList();
        List< List<String> > result = solver(a,n,a);
        return a;
    }

    public static List<String> blankMaker(int n)
    {
        List<String> dots = new ArrayList<>();
        String d = "";
        for(int i=0;i<n;i++)
        {
            d += ".";
        }
        for(int i=0;i<n;i++)
        {
            dots.add(d);
        }
        return dots;
    }

    public static List< List<String> > solver(List< List<String> > a,int n,List< List<String> > res)
    {
        List<String> curr = blankMaker(n);
        return a;
    }
}