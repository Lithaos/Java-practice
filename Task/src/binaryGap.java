
// import java.util.*;

class Solution {
    public int solution(int N) {
        boolean isGap = false;
        int gap = 0;
        String BinaryString = Integer.toBinaryString(N);
        int maxGap=0;
        while(BinaryString.length()>0)
        {   
            if(!isGap && BinaryString.charAt(BinaryString.length()-1)=='1')
            {
                isGap = true;
            }
            else
            BinaryString = BinaryString.substring(0, BinaryString.length());
            if(isGap && BinaryString.charAt(BinaryString.length()-1)=='0')
            {
                gap++;
                BinaryString = BinaryString.substring(0, BinaryString.length() - 1);
            }
            else
            {
                if(gap>maxGap)
                maxGap=gap;
                gap=0;
                BinaryString = BinaryString.substring(0, BinaryString.length() - 1);  
            }
            
        }
        return maxGap;
    }
    public static void main(String[] args)
    {
    	Solution test = new Solution();
    	System.out.println(test.solution(141));
    }
}