public class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) {
            return true;
        }

        int i=0;
        int len = s.length();

        while(i< len){
            char frontChar = s.charAt(0);
            s = s.substring(1).concat(String.valueOf(frontChar));

            if(s.equals(goal)) {
                return true;
            }

            i++;
        }
        return false;
    }
}
