class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
for(int i=0;i<ch.length;i++){
if((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= '0' && ch[i] <= '9')){
    sb.append(ch[i]);
}
}
if(isPalin(sb)) return true;

return false;


    }
    public boolean isPalin(StringBuilder sb){
        if(sb.length() == 1) return true;
        int i=0;
        int j = sb.length()-1;
        while(i < j){
if(sb.charAt(i) != sb.charAt(j)){
    return false;
}else{
    i++;
    j--;
}
        }
        return true;
    }
}
