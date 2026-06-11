class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int can = 0;
            
            for(int I = 1; I<= n; I++) {
                answer = (n * 12000)+(k * 2000) -((n / 10) *2000);
            }
        
            
        
        return answer;
    }
}