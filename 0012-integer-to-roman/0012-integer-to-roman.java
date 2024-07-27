class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int sum=0;
        int n=s.length();
        for(int i=0;i<s.length()-1;i++)
        {
            if( mp.get(s.charAt(i))<mp.get(s.charAt(i+1)))
                sum-=mp.get(s.charAt(i));
            else
            sum+=mp.get(s.charAt(i));
        }
        sum+=mp.get(s.charAt(n-1));
        return sum;
    }
}