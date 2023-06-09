class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] x_only = new int[points.length];
        for(int i = 0;i<points.length; i++)
        {
            x_only[i] = points[i][0];
        }

        Arrays.sort(x_only);
        int max = 0;
        for(int i = 0;i<x_only.length-1;i++)
        {
            if(x_only[i+1]-x_only[i]>max)
                max = x_only[i+1]-x_only[i];
        }

        return max;
    }
}