public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object with initial content
        StringBuilder sb = new StringBuilder("Hello, World!");

        // setCharAt(k, c): Change the character at index 7 to 'w'
        sb.setCharAt(7, 'w');
        System.out.println("After setCharAt: " + sb);

        // insert(k, s): Insert a copy of string "Java " starting at index 7
        sb.insert(7, "Java ");
        System.out.println("After insert: " + sb);

        // append(s): Append string "!!" to the end of the sequence
        sb.append("!!");
        System.out.println("After append: " + sb);

        // reverse(): Reverse the current sequence
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // toString(): Return a traditional String instance based on the current character sequence
        String result = sb.toString();
        System.out.println("Final result: " + result);
    }
}