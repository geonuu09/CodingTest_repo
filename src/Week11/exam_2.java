package Week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

/** 문제 2
 숫자 '1' 부터 'n' 까지를 '사전적 순서'로 벼앨로 출력하고자 한다.
 사전식 순서는 숫자를 문자열로 보고 비교하는 것과 같으며, 규칙은 아래와 같다.

 - 첫 자릿수부터 숫자가 더 작을 수록 앞에 온다. (140 이 21보다 앞에온다)
 - 숫자의 길이가 다르고, 앞자리가 같을 경우 더 짧은 숫자가 앞에 온다. (10 이 104 보다 앞에 온다)
 */

class Solution1 {
    public int[] solution(int n) {
        List<String> numbers = new ArrayList<>();

        // 1부터 n까지의 숫자를 문자열로 리스트에 추가
        for (int i = 1; i <= n; i++) {
            numbers.add(String.valueOf(i));
        }

        // 사전식 순서로 정렬 (람다식 사용)
        Collections.sort(numbers);

        // 정렬된 결과를 int 배열로 변환
        return numbers.stream().mapToInt(s -> Integer.parseInt(s)).toArray();
    }
}
public class exam_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution1().solution(15)));
    }
}
