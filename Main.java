import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) 
    {
        final String regex = "[^a-zA-Z ]+|(?<=\\d)\\s*(?=\\d)|(?<=\\D)\\s*(?=\\d)|(?<=\\d)\\s*(?=\\D)";
        try
        {
        // Copy the string or text file data into below string variable
        final String string = new String(Files.readAllBytes(Paths.get("Text1.txt")));
        final String subst = "";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        // The substituted value will be contained in the result variable
        final String result = matcher.replaceAll(subst); 
        System.out.println("Substitution result: " + result);
        
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

	}
}
