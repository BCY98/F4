package BCY98.a240402;

public class N2 {
    public int[] solution(int n, long left, long right) {
        int r = Long.valueOf(right).intValue();
        int l = Long.valueOf(left).intValue();
        int size = (r - l + 1);
        int[] answer = new int[size];

        int index = 0;
        for (int i = l; i <= r; i++) {
            int row = (int) (i / n);
            int col = (int) (i % n); 

            
            answer[index++] = Math.max(row, col) + 1;
        }
        return answer;
    }

//    public static void main(String[] args) {
//        N2 n2 = new N2();
//        System.out.println(n2.solution(3,2,5));
//
//    }
}
