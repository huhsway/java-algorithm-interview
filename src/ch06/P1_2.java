package ch06;

// 유효한 팰린드롬 풀이2 문자열 직접 비교
public class P1_2 {

    public static boolean isPalindrome(String s) {
        // 정규식으로 유효한 문자만 추출한 다음 모두 소문자로 변경
        String s_filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // 문자열을 뒤집은 다음 String으로 변경
        String s_reversed = new StringBuilder(s_filtered).reverse().toString();
        // 두 문자열이 동일한지 비교
        return s_filtered.equals(s_reversed);
    }


    public static void main(String[] args) {
        String s = "Do geese see God?";
        System.out.println(isPalindrome(s));
    }

}
