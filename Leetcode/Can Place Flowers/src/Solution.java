class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int numberOfFlowersPlanted = 0;
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                numberOfFlowersPlanted++;
                if (numberOfFlowersPlanted == n) {
                    return true;
                }
            }
        }
        return false;
    }
}