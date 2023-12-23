public class p19c {
    public static void main(String[] args) {
        String text = "  Hello, World!  ";
        String trimmedText = text.trim();
        String lowerCaseText = trimmedText.toLowerCase();
        boolean startsWithHello = lowerCaseText.startsWith("hello");
        boolean containsWorld = lowerCaseText.contains("world");
        String replacedText = trimmedText.replace("World", "Java");
        System.out.println("Original Text: " + text);
        System.out.println("Trimmed Text: " + trimmedText);
        System.out.println("Lowercase Text: " + lowerCaseText);
        System.out.println("Starts with 'hello': " + startsWithHello);
        System.out.println("Contains 'world': " + containsWorld);
        System.out.println("Replaced Text: " + replacedText);
    }
}
