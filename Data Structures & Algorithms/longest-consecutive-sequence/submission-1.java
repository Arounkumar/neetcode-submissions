class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> iSet = new HashSet();
        int l = 0;
        for (int num : nums) {
            iSet.add(num);
        }
        for (int num : nums) {
            int count =1;
            if(iSet.contains(num-1)){
                continue;
            }else {
                int tnum = num;
                while(iSet.contains(tnum+1)){
                    count+=1;
                    tnum +=1;
                }
                l = Math.max(count, l);

            }

        }
        return l;
    }
}
