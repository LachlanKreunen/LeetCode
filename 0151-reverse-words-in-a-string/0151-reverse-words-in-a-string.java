class Solution {
    public String reverseWords(String s) {

        List<String> result = new ArrayList<>();

        s = s.trim();
        String temp = "";
       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (!temp.isEmpty()) {
                    result.add(temp);
                    temp = "";
                }
            } else {
                temp += c;
            }
        }

        if (!temp.isEmpty()) {
            result.add(temp);
        }

        StringBuilder end = new StringBuilder();
        for (int j = result.size() - 1; j >= 0; j--) {
            end.append(result.get(j));
            if(j > 0)
                end.append(" ");
        }

        return end.toString();
    }
}