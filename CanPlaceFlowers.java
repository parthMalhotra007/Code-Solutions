public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean flag = false;
        boolean inside = false;
        int len = flowerbed.length;
        int ctr = 0;

        if (len == 0)
            return false;

        if(len == 1 && flowerbed[0] ==0)
        {
            flowerbed[0] = 1;
            ctr++;
            inside = true;
        }
        // if 1 skip for next ,adjacent case
        if( len >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0)
        {
            flowerbed[0] = 1;
            ctr++;
            inside = true;
        }
        if(len >= 2 && flowerbed[len-1] == 0 && flowerbed[len-2] == 0)
        {
            flowerbed[len-1] = 1;
            ctr++;
            inside = true;
        }
        for (int i = 1; i < len-1 ; i++)
        {
            if (flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1 && flowerbed[i] == 0 ) {
                flowerbed[i] = 1;
                inside = true;
                ctr++;
            }
        }
        if(ctr >= n && inside || ctr == n)
            flag = true;

        return flag;
    }

    public static void main(String[] args) {
        int [] flowerbed = {1,0,0,0,1};
        int n = 2;
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerbed,n));
    }
}
