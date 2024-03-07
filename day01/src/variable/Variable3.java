package variable;

public class Variable3 {

    public static void main(String[] args) {
        int a = 10;
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = new String("abc");

        // 주소 비교
        System.out.println("str1 == str3: " + str1 == str3);
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        str3 = "10";
        str1 = "ab";

        int result = Integer.parseInt(str3);
        System.out.println("result: " + result);

        int num = 100;
        String result2 = num + "";
        System.out.println("result2: " + result2);
    }

}
