1) Remove the “stop words”
Language Used: Java
Program Called: App.java
Execution Steps: 
Note: Please put all of these test files (Text1.txt, Text2.txt, stopwords.txt) in the same directory as your Program file. 

1)	Open a text editor like Notepad on windows and copy the program called App.java from GitHub repo and paste it in the text editor and Save the file as App.java and update the program file Paths as described below: (Please use the same file name as mentioned above because the class inside the program defined based on the file name)
-	Inside the try block statement, change the stopWordsFile variable value name as highlighted below:  (This is your stopword text file which contains the list of “stop words”)

•	Scanner stopWordsFile = new Scanner(new File("stopwords.txt"));

-	Inside the try block statement, change the textFile variable value name as highlighted below: (This is your test file either “the Declaration of Independence (text1.txt)” OR  “the text of Alice in Wonderland (text2.txt)”) 

•	Scanner textFile = new Scanner(new File("Text1.txt"));


2)	In this step, we will compile the program. For this, open command prompt (cmd) on Windows. To compile the program, type the following command and hit enter.

•	javac App.java

Note: You may get this error when you try to compile the program: “javac’ is not recognized as an internal or external command, operable program or batch file“. This error occurs when the java path is not set in your system.

Set Path in Windows:
Open command prompt (cmd), go to the place where you have installed java on your system and locate the bin directory, copy the complete path and write it in the command like below:
•	 set path=C:\Program Files\Java\jdk1.8.0_121\bin

Note: Your jdk version may be different. Since I have java version 1.8.0_121 installed on my system, I mentioned the same while setting up the path.

3)	After compilation, the .java file gets translated into the .class file (byte code). Now we can run the program. To run the program, type the following command and hit enter:
•	Java App
Note: that you should not append the .java extension to the file name while running the program.
The program is created based on the following consideration (below statement are also   added into Program):
1.	Load the text files (stopwords.txt and Text1.txt OR Text2.txt)
2.	Create a set for the stop words (a set, as it doesn't allow duplicates) and For each word in the file convert to lowercase.
3.	Splits strings and stores each word into a list
4.	Create an empty list (a list because it allows duplicates) 
5.	Iterate over the array and convert the current string index to lowercase. If the word isn't a stop word, add to listOfWords ArrayList
6.	Print the final string (listOfWords ArrayList)
NOTE: I compiled this program through the below online Java Compiler which allows me to select the test files (stopwords.txt and Text1.txt OR Text2.txt) from my computer’s local directory: 
https://www.onlinegdb.com/online_java_compiler

2) Remove the all non-alphabetical text
Language Used: Java
Program Called: Main.java
Execution Steps:
Note: Please put all of these test files (Text1.txt, Text2.txt, stopwords.txt) in the same directory as your Program file. 
For this java program, I used the java.util.regex.Matcher and java.util.regex.Pattern libarary.

1)	- Open a text editor like Notepad on windows and copy the program called Main.java from GitHub repo and paste it in the text editor and Save the file as Main.java and update the program file Paths as described below: (Please use the same file name as mentioned above because the class inside the program defined based on the file name)
-	Inside the try block statement, change the string variable value name as highlighted below: (This is your test file either “the Declaration of Independence (text1.txt)” OR  “the text of Alice in Wonderland (text2.txt)”) 

•	final String string = new String(Files.readAllBytes(Paths.get("Text1.txt")));

2)	In this step, we will compile the program. For this, open command prompt (cmd) on Windows. To compile the program, type the following command and hit enter.

•	javac Main.java

Note: You may get this error when you try to compile the program: “javac’ is not recognized as an internal or external command, operable program or batch file“. This error occurs when the java path is not set in your system.

Set Path in Windows:
Open command prompt (cmd), go to the place where you have installed java on your system and locate the bin directory, copy the complete path and write it in the command like below:
•	 set path=C:\Program Files\Java\jdk1.8.0_121\bin

Note: Your jdk version may be different. Since I have java version 1.8.0_121 installed on my system, I mentioned the same while setting up the path.

3)	After compilation, the .java file gets translated into the .class file (byte code). Now we can run the program. To run the program, type the following command and hit enter:
•	Java Main
Note: that you should not append the .java extension to the file name while running the program.
The program is created based on the following consideration (below statement are also   added into Program):
1.	Copy the string or text file data into below string variable
2.	Use the Pattern.compile and pattern.matcher to compiles the given regular expression into a pattern.
3.	Create a matcher for the input string
4.	The substituted value will be contained in the result variable
5.	Print the final string (result)
NOTE: I compiled this program through the below online Java Compiler which allows me to select the test files (stopwords.txt and Text1.txt OR Text2.txt) from my computer’s local directory: 
https://www.onlinegdb.com/online_java_compiler


3) Stems words into their root form, computes the frequency of each term, and prints out the 20 most commonly occurring terms (not including stop words) in descending order of frequency. 

Language Used: Python 3.9.0 (If you want to install Python for this question, then go to the below link and Click on Download Python 3.9.0 button and execute the python-3.9.0-amd64.exe file:
https://www.python.org/downloads/
Program Called:  StemmingWords.py
Execution Steps:
Note: Please put all of these test files (Text1.txt, Text2.txt, stopwords.txt) in the same directory as your Program file. 
Open a text editor like Notepad on windows Copy the program from GitHub repo and paste it in the text editor and save the file as StemmingWords.py

1)	Install NLTK
Once you have installed the Python on your machine, open the Python app on your computer, which will open up the Python cmd and type the following command to install the NLTK library.
            #import the nltk package
       import nltk

      #call the nltk downloader
      nltk.download()

nltk.download() will call a Graphical Window will appear to choose different corpus and datasets to choose from. Click on Models tab and select punkt and click Download.

2)	Split into Words

NLTK provides a function called word_tokenize() for splitting strings into tokens (nominally words).

It splits tokens based on white space and punctuation. For example, commas and periods are taken as separate tokens. Contractions are split apart (e.g. “What’s” becomes “What” “‘s“). Quotes are kept, and so on.
Note: You have to change the file variable value, 

# load data
file = open("C:/Users/hpatel/Downloads/programming_assignment/Text1.txt", 'rt')
text = file.read()
file.close()

# split into words
from nltk.tokenize import word_tokenize
tokens = word_tokenize(text)
print(tokens)

3)	Filter Out Punctuation

We can filter out all tokens that we are not interested in, such as all standalone punctuation.

This can be done by iterating over all tokens and only keeping those tokens that are all alphabetic. Python has the function isalpha() that can be used. For example:

# load data
file = open("C:/Users/hpatel/Downloads/programming_assignment/Text1.txt", 'rt')
text = file.read()
file.close()

# split into words
from nltk.tokenize import word_tokenize
tokens = word_tokenize(text)

# convert to lower case
tokens = [w.lower() for w in tokens]

# remove punctuation from each word
import string
table = str.maketrans('', '', string.punctuation)
stripped = [w.translate(table) for w in tokens]

# remove remaining tokens that are not alphabetic
words = [word for word in stripped if word.isalpha()]
print(words)

4)	Filter out Stop Words (and Pipeline)

Stop words are those words that do not contribute to the deeper meaning of the phrase.
They are the most common words such as: “the“, “a“, and “is“.
For some applications like documentation classification, it may make sense to remove stop words.

NLTK provides a list of commonly agreed upon stop words for a variety of languages, such as English. We will be using the stopwords.txt file which was given with this programming assignment and the path for this file is specified as highlighted below. 

# filter out stop words
file1 = open("C:/Users/hpatel/Downloads/programming_assignment/stopwords.txt", 'rt')
text1 = file1.read()
stop_words = set(text1.split())
words = [w for w in words if w not in stop_words]
print(words)

5)	Stem Words
Stemming refers to the process of reducing each word to its root or base.
For example “fishing,” “fished,” “fisher” all reduce to the stem “fish.”
Some applications, like document classification, may benefit from stemming in order to both reduce the vocabulary and to focus on the sense or sentiment of a document rather than deeper meaning.
There are many stemming algorithms, although a popular and long-standing method is the Porter Stemming algorithm. This method is available in NLTK via the PorterStemmer class.

For example:

# load data
file = open("C:/Users/hpatel/Downloads/programming_assignment/Text1.txt", 'rt')
text = file.read()
file.close()

# split into words
from nltk.tokenize import word_tokenize
tokens = word_tokenize(text)

# stemming of words
from nltk.stem.porter import PorterStemmer
porter = PorterStemmer()
stemmed = [porter.stem(word) for word in words]
print(stemmed)
The program is created based on the following consideration:
6.	Load the raw text.
7.	Split into tokens.
8.	Convert to lowercase.
9.	Remove punctuation from each token.
10.	Filter out remaining tokens that are not alphabetic.
11.	Filter out tokens that are stop words.
12.	Filter out Stop Words (and Pipeline)
