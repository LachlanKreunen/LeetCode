class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        int temp;

        HashSet<Integer> seen = new HashSet<>();
        
        
        for (Integer count : map.values()){
            if (seen.contains(count))
                return false;
                
            seen.add(count);
        }
        return true;
    }
}