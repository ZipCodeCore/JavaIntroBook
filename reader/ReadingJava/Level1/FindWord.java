import java.util.Scanner;

public class FindWord {

    public int countWords(String input, String target) {
        int wordsLen, i, count=0;
        input = input.toLowerCase();
        target = target.toLowerCase();

        String words[] = input.split("\\s+");
        wordsLen = words.length;

        for(i=0; i<wordsLen; i++) {
            if(word.equals(words[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str, word;
        int wordsLen, i, count=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        str = s.nextLine();
        System.out.print("\nEnter a Word to Find its Occurrence: ");
        word = s.next();

        count = new FindWord.countWords(str, word);

        System.out.println(testResult(count, word));

    }

    public String testResult(int count, String word) {
        if(count==0)
            return "\nThe word \"" +word+ "\" is not found in the String.";
        else if(count==1)
            return "\nThe word \"" +word+ "\" occurs only one time.";
        else
            return "\nThe word \"" +word+ "\" found, " +count+ " times.";
    }
}
