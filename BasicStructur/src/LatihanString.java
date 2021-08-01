public class LatihanString {
    public static void main(String[] args){
        String greeting = "Hello bro";
        System.out.println(greeting);

        char[] mynameChars = { 'f', 'a', 'k', 'h', 'r', 'u'};
        String mynameString = new String(mynameChars);
        System.out.println(mynameChars);

        // mengetahui panjang string method length()
        int length = greeting.length();
        System.out.println(length);

        // mengambil karakter dari Stirng
        char result = greeting.charAt(1);
        System.out.println(result);

        // mengubah toLowerCase() - toUpperCase()
        String low = greeting.toLowerCase();
        System.out.println(low);
    }
}
