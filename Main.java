import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
    ArrayList<String> words = new ArrayList<String>();
    words.add("to");
    words.add("tool");
    words.add("stool");
    words.add("tools");
    System.out.println(words);
    WordChecker x = new WordChecker(words);
    System.out.println(x.isWordChain());
    System.out.println(x.createList("to"));
    }
}
