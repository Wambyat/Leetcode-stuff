/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public static class res
    {
        int[] fir;
        int[] sec;
        public res(int[] f,int[] s)
        {
            this.fir = f;
            this.sec= s;
        }
    }

    
    
    //This splits the given int[] into 2 based on pos.
    /*
    public static res split(int[] array, int pos) 
    {
        if(pos+1 >= array.length)
        {
            return new res(array, new int[0]);
        }
        int[] firstArray = new int[pos];
        int[] secondArray = new int[array.length - pos];

        for (int i = 0; i < pos; i++) {
            firstArray[i] = array[i];
        }

        for (int i = pos; i < array.length; i++) {
            secondArray[i - pos] = array[i];
        }

        return new res(firstArray, secondArray);
    }
    */
    public static res split(int[] array,int pos)
    {
        
        if(pos+1 >= array.length)
        {
            return new res(Arrays.copyOfRange(array, 0, pos), new int[0] );
        }

        int[] firstArray = Arrays.copyOfRange(array, 0, pos);
        int[] secondArray = Arrays.copyOfRange(array, pos + 1, array.length);

        return new res(firstArray,secondArray);
    }

    //This find the index of the largest element in the given int[].
    public static int largestIndex(int[] array)
    {
        int index = 0;
        int max = 0;
        for(int i = 0; i<array.length; i++)
        {
            if (array[i]>max)
            {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        /*
        int[] firstArr,secondArr;
        res r = split(nums ,largestIndex(nums));
        firstArr = r.fir;
        secondArr = r.sec;
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
        */
        TreeNode t = recurssiveReturner(nums);

        return t;
    }

    //Recursive is possible ig. split until 0 size or 1 and return the TreeNode.
    //Dont call if the array is 0, Remeber to proceed directly to other node/ return back.
    public static TreeNode recurssiveReturner(int[] nums)
    {
        TreeNode t = new TreeNode();
        if (nums.length == 1)
        {
            return new TreeNode(nums[0]);
        }

        else
        {
            int max = largestIndex(nums);
            int[] firstArr,secondArr;

            t.val = nums[max];
            System.out.println("Largest is "+t.val);
            
            res r = split(nums ,largestIndex(nums));
            firstArr = r.fir;
            secondArr = r.sec;
            System.out.println("Left is "+Arrays.toString(firstArr));
            System.out.println("Right is "+Arrays.toString(secondArr));
            
            if(firstArr.length > 0)
            {
                t.left = recurssiveReturner(firstArr);
            }
            else
            {
                t.left = null;
            }
            
            if(secondArr.length > 0)
            {
                t.right = recurssiveReturner(secondArr);
            }
            else
            {
                t.right = null;
            }

            return t;
        }
    }
}
