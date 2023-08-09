public class StringP {
    public static void main(String[] args) {
        String name = "Shahid Hasan Shuvo";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("a","x"));
        System.out.println(name.endsWith("Shuvo"));
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.length());
        System.out.println(name.indexOf("Ha"));
        String name1 = "        Shahid Hasan Shuvo";
        System.out.println(name1);
        System.out.println(name1.trim());
    }
}
