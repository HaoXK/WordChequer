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
    ArrayList<String> wordsv2 = new ArrayList<String>();
    wordsv2.add("an");
    wordsv2.add("band");
    wordsv2.add("band");
    wordsv2.add("abandon");
    System.out.println(wordsv2);
    WordChecker y = new WordChecker(wordsv2);
    System.out.println(y.isWordChain());
    }
}
