class Solution {
    public String removeStars(String s) {
        Stack<Character> end = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for( int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '*'){
                end.push(s.charAt(i));
            } else {
                end.pop();
            }
        }

        while(!end.isEmpty())
            answer.append(end.pop());

        return answer.reverse().toString();
    }
}