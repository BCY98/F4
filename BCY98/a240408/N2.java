package BCY98.a240402;

public class N2 {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] answer = new int[size];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            int x = (int) (i / n);
            int y = (int) (i % n);

            // 주어진 행과 열에 해당하는 값 구하기
            answer[idx++] = Math.max(x, y) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        N2 n2 = new N2();
        System.out.println(n2.solution(3,2,5));

    }
}
