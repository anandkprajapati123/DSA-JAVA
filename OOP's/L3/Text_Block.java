// In Java, a text block is a feature introduced in Java 13 (as a preview) and officially added in Java 15. It allows you to declare multi-line string literals more easily and readably, without needing explicit line breaks (\n) or escape characters for quotes.

public class Text_Block {
    public static void main(String[] args) {
        String text = """
            This is a sample
            multi-line text block.
            You can write multiple lines
            without using newline characters explicitly.
            """;
        System.out.println(text);
        String json = """
            {
                "name":"Anand",
                "age":"20",
                "city":"Varanasi"
            }
            """;
        System.out.println(json);
    }
}

