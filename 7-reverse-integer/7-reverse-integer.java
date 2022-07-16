class Solution {
    public int reverse(int x) {
         
          StringBuilder s = new StringBuilder(x + "");
        if (s.charAt(0) == '-') {
            s.delete(0, 1);
            s.reverse();
            s.insert(0, '-');
        } else if (s.charAt(0) == '+') {
            s.delete(0, 1);
            s.reverse();
            s.insert(0, '+');
        } else
            s.reverse();
        int val;
        try {
            val = Integer.parseInt(s.toString());
        } catch (Exception e) {
            val = 0;
        }
        return val;
    }
}