class Solution {
    public String intToRoman(int num) {
        String output = "";
        int position = 0;
        int i = 0;
        while(num>0)
        {
            position += 1;
            i = num%10;
            num = num/10;
            switch(position)
            {
                case 1:
                    if(i<4)
                    {
                        output = "I".repeat(i) + output;
                    }
                    else if(i==4)
                    {
                        output = "IV" + output;
                    }
                    else if(i<9)
                    {
                        output = "I".repeat(i-5)+ output;
                        output = "V" + output;

                    }
                    else
                    {
                        output = "IX"+ output;
                    }
                    break;
                case 2:
                    if(i<4)
                    {
                        output = "X".repeat(i)+ output;
                    }
                    else if(i==4)
                    {
                        output = "XL" + output;
                    }
                    else if(i<9)
                    {
                        output = "X".repeat(i-5)+ output;
                        output = "L"+ output;

                    }
                    else
                    {
                        output = "XC"+ output;
                    }
                    break;
                
                case 3:
                    if(i<4)
                    {
                        output = "C".repeat(i)+ output;
                    }
                    else if(i==4)
                    {
                        output = "CD"+ output;
                    }
                    else if(i<9)
                    {
                        output = "C".repeat(i-5)+ output;
                        output = "D"+ output;
                    }
                    else
                    {
                        output = "CM"+ output;
                    }
                    break;
                default:
                    output = "M".repeat(i)+ output;
                    break;
            }
        }

        return output;
    }
}