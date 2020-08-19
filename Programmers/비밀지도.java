package algorithm.Programmers.Lv1;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int arr1[] = {9, 20, 28, 18, 11};
        int arr2[] = {30, 1, 21, 17, 28};
        // "#####","# # #", "### #", "# ##", "#####"

        solution(n, arr1, arr2);
    }

    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String binStr, result;
        for(int i=0; i<n; i++) {
            binStr = Integer.toBinaryString(arr1[i] | arr2[i]);

            result = String.format("%" + n + "s", binStr);
            result = result.replace("1", "#");
            result = result.replace("0", " ");

            answer[i] = result;
        }

        return answer;
    }
}
