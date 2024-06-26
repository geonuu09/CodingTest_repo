package Week11;

import java.math.BigInteger;

class Solution {

    public int solution(int n, int num) {
        // 초기 숫자를 문자열로 변환
        String result = Integer.toString(num);

        // n 번 반복
        // reslut 를 다시 result 로 초기화
        for(int i = 0; i<n; i++) {
            result = readCountNum(result);
        }

        // 결과 문자열을 Biginteger로 변환 후 10004로 나눈 나머지 반환


        // result를 BigInteger 객체로 변환
        // big.mod(BigInteger.valueOf(10004)) -> BigInteger로 변환 후 mod(나머지 연산) 한 후
        // .intValue() 정수로 변환.
        BigInteger big = new BigInteger(result);
        return big.mod(BigInteger.valueOf(10004)).intValue();

        /** BigInteger와 long 차이
         long은 java 기본 데이터 타입 중 하나.
         BigInteger java.math 패키지의 포함된 클래스
         Big은 메모리가 허용하는 한 무한정 커질 수 있다.
         long은 64비트 내에서 처리가능한 숫자이면서 속도가 빨라야하는 작업에 좋다.
        */
    }

    private String readCountNum(String numStr) {
        StringBuilder ret = new StringBuilder();
        int[] count = new int[10]; // 0-9까지 숫자의 출현 횟수를 셈

        for (char c : numStr.toCharArray()) { // 각 숫자의 출현 횟수를 셈
            count[c - '0']++;
        }

        // 0-9까지 숫자에 대해 출현 횟수가 0이 아닌 경우 결과 문자열에 추가
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                ret.append(i).append(count[i]);
            }
        }
        return ret.toString();

    }
}


class exam_1 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3,11523));
    }
}