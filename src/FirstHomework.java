public class FirstHomework {
    public static void main(String[] args) {
        String str = "I Love Java";
        boolean contains = str.contains("I Love Java");
        System.out.println("Number of characters in phrase(with spaces)" + ": " + str.length());
        System.out.println("Character from index 4 is: " + str.charAt(4));
        System.out.print("Index of character J in phrase is" + ": ");
        System.out.println(str.indexOf("J"));
        System.out.println(str.concat(" and QA Automation"));
        System.out.println(contains);
    }
}
