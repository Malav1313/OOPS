public class p19b {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        StringBuffer stringBuffer = new StringBuffer("World!");
        stringBuilder.append("Java ");
        stringBuffer.append("Programming ");
        System.out.println("StringBuilder: " + stringBuilder.toString());
        System.out.println("StringBuffer: " + stringBuffer.toString());
    }
}
