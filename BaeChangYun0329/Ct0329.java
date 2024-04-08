package BaeChangYun0329;

public class Ct0329 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int u = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j=0; j<index; j++){
                c++;
                if(c == skip.charAt(u)){
                    u++;
                    continue;
                }
                s.replace(s.charAt(i),c);
            }
            answer = s;
        }
        return answer;
    }
}
