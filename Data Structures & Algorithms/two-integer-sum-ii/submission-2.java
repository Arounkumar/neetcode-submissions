class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] op = new int[2];
        while (l < r) {
            if (target == (numbers[l] + numbers[r])) {
                op[0] = l + 1;
                op[1] = r + 1;
                break;
            } else if (target < (numbers[l] + numbers[r])) {
                r--;
            } else if (target > (numbers[l] + numbers[r])) {
                l++;
            }
        }
        return op;
    }
}
