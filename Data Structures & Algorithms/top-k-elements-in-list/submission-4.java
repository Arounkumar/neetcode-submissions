class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer> ();
        for(int num : nums){
            freqMap.putIfAbsent(num, 0);
            freqMap.put(num, freqMap.get(num)+1);
        }
        List<List<Integer>> fcList = new ArrayList(); 
        // int[] countAry = new int[nums.length + 1];
        for (int i =0; i< nums.length+1; i++){
            fcList.add(new ArrayList<Integer>());
        }

        for(int key : freqMap.keySet()){
            // countAry[freqMap.get(key)] = key;
            fcList.get(freqMap.get(key)).add(key);
        }
        int count =0;
        for(int i = fcList.size() - 1; i>=0 && count <k ; i--){
            for (int num : fcList.get(i)){
                result[count] = num;
                count ++ ;
            }
        }
        return result;
    }
}
