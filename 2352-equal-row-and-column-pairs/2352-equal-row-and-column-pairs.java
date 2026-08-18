class Solution {
    public int equalPairs(int[][] grid) {
          int count = 0;
          Map<String, Integer> rowMap = new HashMap<>();
          for( int i = 0; i < grid.length; i++){
            String rowKey = Arrays.toString(grid[i]);
             if(!rowMap.containsKey(rowKey)){
                rowMap.put(rowKey,1);
             } else {
                rowMap.put(rowKey, rowMap.get(rowKey) + 1);
             }
          }

          for(int j = 0; j < grid.length; j++){
            int[] col = new int[grid.length];
            for( int i = 0; i < grid.length; i++){
                col[i] = grid[i][j];
            }

            String colKey = Arrays.toString(col);

            if(rowMap.containsKey(colKey)){
                count += rowMap.get(colKey);
            }
          }

          return count;
    }
}