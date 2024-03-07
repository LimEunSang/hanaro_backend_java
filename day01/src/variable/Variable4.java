package variable;

public class Variable4 {

    public static void main(String[] args) {
        String str = "jmlee@tonesol.com";

        // id와 domain을 출력하시오
        String id = str.substring(0, str.indexOf('@'));
        String domain = str.substring(str.indexOf('@') + 1, str.indexOf('.'));

        System.out.printf("%s, %s\n", id, domain);

        String str2 = "abc";

        // 대문자 역순 출력
        StringBuffer sb = new StringBuffer(str2);
        String reverse = sb.reverse().toString().toUpperCase();

        System.out.printf("reverse: " + reverse);




    }

}
