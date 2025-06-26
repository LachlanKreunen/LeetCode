class Solution {
    public int compress(char[] chars) {
        String s = "";
        char choose = chars[0];
        int count = 0;
        for(char c : chars){
            if(c == choose){
                count++;
            } else if(count > 1){
                s += choose + "" + count;
                choose = c;
                count = 1;
            } else {
                s += choose;
                choose = c;
                count = 1;
            }
        }

        if (count > 1)
            s += choose + "" + count;
        else
            s += choose;

        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }

        return s.length();

    }
}