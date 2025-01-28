class Solution {
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        char[] fow = new char[y.length()];
        fow = y.toCharArray();
        int n = fow.length;
        for(int i=0; i<n; i++){
            if(fow[i]==fow[n-(i+1)]){

            }
            else{
                return false;
            }
            }
            return true;
        }    
}