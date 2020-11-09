import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App 
{
  public static void main(String[] args) 
  {
    try 
    {
        // 1.  Load the text files(stopwords.txt and Text1.txt)
        Scanner stopWordsFile = new Scanner(new File("stopwords.txt"));
        Scanner textFile = new Scanner(new File("Text1.txt"));

        // 2.  Create a set for the stop words (a set as it doesn't allow duplicates)
        Set<String> stopWords = new HashSet<String>();
        // For each word in the file
        while (stopWordsFile.hasNext()) 
        {
            stopWords.add(stopWordsFile.next().trim().toLowerCase());
        }

        // 3.  Splits strings and stores each word into a list
        ArrayList<String> words = new ArrayList<String>();
        while (textFile.hasNext()) 
        {
            words.add(textFile.next().trim().toLowerCase());
        }

        // 4.  Create an empty list (a list because it allows duplicates) 
        ArrayList<String> listOfWords = new ArrayList<String>();

        // 5.  Iterate over the array 
        for(String word : words) 
        {
            // Converts current string index to lowercase
            String toCompare = word.toLowerCase();
            // If the word isn't a stop word, add to listOfWords list
            if (!stopWords.contains(toCompare)) 
            {
                listOfWords.add(word);
            }
        }

        stopWordsFile.close();
        textFile.close();

        for (String str : listOfWords) 
        {
            // 6.  Print the final string (list of wrods)
            System.out.print(str + " ");
        }
    } 
    catch(FileNotFoundException e)
    {
        e.printStackTrace();
    }
  }
}
