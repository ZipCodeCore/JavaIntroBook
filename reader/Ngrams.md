# N-Grams

N-grams are a contiguous sequence of n items from a given sample of text or speech. An n-gram of size 1 is referred to as a "unigram"; size 2 is a "bigram"; size 3 is a "trigram". Larger sizes are sometimes referred to by the value of n, e.g., "4-gram", "five-gram", and so on.

N-grams are used in various fields of study, including computational linguistics, natural language processing (NLP), and data mining. They are used to model the probability of the next item in a sequence, given the previous items. N-grams are also used in machine learning algorithms, such as Naive Bayes and Markov models.

In this chapter, we will explore the concept of n-grams, how they are generated, and how they are used in various applications.

## What's an N-Gram Look Like

An n-gram is a sequence of n items from a given sample of text or speech. For example, consider the sentence "The quick brown fox jumps over the lazy dog." Here are some examples of n-grams from this sentence:

- Unigrams (1-grams): "The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"
- Bigrams (2-grams): "The quick", "quick brown", "brown fox", "fox jumps", "jumps over", "over the", "the lazy", "lazy dog"
- Trigrams (3-grams): "The quick brown", "quick brown fox", "brown fox jumps", "fox jumps over", "jumps over the", "over the lazy", "the lazy dog"

N-grams are used to model the probability of the next item in a sequence, given the previous items. For example, in the sentence "Written in the New York Times," the bigram "New York" is more likely to occur than the bigram "York Times." And that n-gram is quite different from the trigram "in the New."

If we had two three-grams like "New York Times" and the "New York Yankees", we could use the context of the sentence to determine which one is more likely to be the next word in the sequence. For the newspaper, it would be "Times," and for the baseball team, it would be "Yankees." And adding the word "beat" to the end of the sentence would make it clear which one we were talking about. (the paper, not the team) But if we were talking about the team, we might add "won" to the end of the sentence. (now the sentence is about the team, not the paper).

To a human, n-grams tend to provide specific context or meaning. To a computer, they are just a sequence of characters or words. The computer can't tell the difference between the two three-grams, but it can tell you which one is more likely to be the next word in the sequence. If someone says "New York Yankees" you might think about your feelings about the team, or the city, or the sport. The computer just knows that the next word is likely to be "won" or "lost" or "played" or "beat." And that's a big difference.

## Generating N-Grams

To generate n-grams from a given sample of text, we slide a window of size n over the text and extract the n-grams from each position. For example, to generate bigrams from the sentence __"We hold these truths to be self-evident, that all men are created equal, that they are endowed by their Creator with certain unalienable Rights, that among these are Life, Liberty and the pursuit of Happiness."__ we would slide a window of size 2 over the sentence and extract the bigrams at each position:

1. "We hold"
2. "hold these"
3. "these truths"
4. "truths to"
5. "to be"
6. "be self-evident"

and so on.

The process is repeated for trigrams or 4-grams, like "We hold these truths" and "the pursuit of Happiness".

## Spliting Text into Words and n-grams

Here is a Java program which can generate n-grams from a given text:

```java
import java.util.ArrayList;
import java.util.List;

public class NGramGenerator {

    // examine this method carefully. what is it doing?
    // what kind of data structure is it creating?

    public static List<String> generateNGrams(String text, int n) {
        List<String> ngrams = new ArrayList<>();
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length - n + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    sb.append(" ");
                }
                sb.append(words[i + j]);
            }
            ngrams.add(sb.toString());
        }
        return ngrams;
    }

    public static void main(String[] args) {
        String text = "We hold these truths to be self-evident, that all men are created equal, that they are endowed by their Creator with certain unalienable Rights, that among these are Life, Liberty and the pursuit of Happiness.";

        List<String> bigrams = generateNGrams(text, 2);
        System.out.println("Bigrams:");
        for (String bigram : bigrams) {
            System.out.println(bigram);
        }

        List<String> trigrams = generateNGrams(text, 3);
        System.out.println("\nTrigrams:");
        for (String trigram : trigrams) {
            System.out.println(trigram);
        }

        List<String> fourgrams = generateNGrams(text, 4);
        System.out.println("\nFourgrams:");
        for (String fourgram : fourgrams) {
            System.out.println(fourgram);
        }

    }
}
```

## Applications of N-Grams

N-grams are used in various applications, including:

- **Language Modeling**: N-grams are used to model the probability of the next word in a sequence, given the previous words. This is used in speech recognition, machine translation, and other natural language processing tasks.

- **Text Prediction**: N-grams are used in text prediction systems to suggest the next word or phrase based on the context of the input text.

- **Spelling Correction**: N-grams are used in spelling correction systems to suggest corrections for misspelled words based on the context of the surrounding words.

- **Information Retrieval**: N-grams are used in information retrieval systems to index and search for text documents based on the n-grams present in the documents.

- **Machine Learning**: N-grams are used in machine learning algorithms, such as Naive Bayes and Markov models, to model the probability of sequences of words or characters.

- **Sentiment Analysis**: N-grams are used in sentiment analysis to analyze the sentiment of text documents based on the n-grams present in the documents.

- **Named Entity Recognition**: N-grams are used in named entity recognition systems to identify and classify named entities in text documents based on the n-grams present in the documents.

## Conclusion

N-grams are a powerful tool for modeling the probability of sequences of words or characters in text or speech. They are used in a wide range of applications, including language modeling, text prediction, spelling correction, information retrieval, machine learning, sentiment analysis, and named entity recognition. By generating n-grams from a given sample of text, we can extract valuable insights and patterns that can be used to improve various natural language processing tasks.

## Exercises

1. Write a Java program that generates n-grams from a given text and counts the frequency of each n-gram.

2. Modify the program to generate n-grams of characters instead of words. (whoa?) (can you do this?)

