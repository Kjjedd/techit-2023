import com.sun.security.jgss.GSSUtil;

public class StringExample {
    public static void main(String[] args) {
        String str_1 = "Hello,";
        String str_2 = "World!";
        System.out.println(str_1 + " " + str_2);

        StringBuilder strbdr = new StringBuilder("Hello, ");
        strbdr.append("World!");
        System.out.println(strbdr);
        System.out.println();

        /**
         * 문자열 슬라이스
         * substring(시작인덱스, 마지막인덱스 + 1)
         */
        String str = "이름: 김종언";
        String name = str.substring(4, 7);
        System.out.println(name);
        System.out.println();

        /**
         * 문자열 대소문자 변환
         * toLowwerCase / toUpperCase
         */
        String low = "abc";
        String up = "ABC";
        String lowToup = low.toUpperCase();
        String upTolow = up.toLowerCase();
        System.out.println(lowToup);
        System.out.println(upTolow);
        if(low.equalsIgnoreCase(up)) System.out.println("low == up");
        System.out.println();

        /**
         * 공백제거
         * .trim(); -> 양쪽 끝의 공백 제거
         * .replace(" ", ""); -> 그 외의 경우
         */
        String s = "  He  l  lo  ";
        System.out.println(s);
        String s2 = s.trim();
        System.out.println(s2);
        String s3 = s.replace(" ", "");
        System.out.println(s3);
    }
}
