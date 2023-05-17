class c {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = Integer.MIN_VALUE;
        for (int j = 0; j < accounts.length; j++) {
            int sum = 0;
            for (int k = 0; k < accounts[j].length; k++ ) {
                sum += accounts[j][k];
            }
            if (sum > maximumWealth) {
                maximumWealth = sum;
            }
        }
        return maximumWealth;
    }
}