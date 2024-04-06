public class BinaryGap {
    public int solution(int N) {
        int [] binaryArray = new int[32];
        int index = 0;
        int zeroCtr = 0;
        int max = -1;
        while(N > 0) //9 //1001
        {
            binaryArray[index++] = N % 2;
            N = N / 2;
        }

        for(int i = index-1; i >= 0 ; i--)
        {
            if( binaryArray[i] == 1 )
            {
                for (int j = index-2; j >= 0  ; j--) {
                    if (binaryArray[j] == 0)
                    {
                        zeroCtr ++;
                        max = Math.max(max,zeroCtr);
                    }
                    else
                    {
                        zeroCtr = 0;
                        break;
                    }

                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        int ans = binaryGap.solution(1041);
        System.out.println(ans);
    }

}
