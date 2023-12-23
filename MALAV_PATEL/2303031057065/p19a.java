public class p19a {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, ");
        stringBuffer.insert(6, "Java ").append("World!").delete(0, 6).reverse();
        System.out.println(stringBuffer.toString());
    }
}
