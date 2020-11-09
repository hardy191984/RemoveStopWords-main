# 1. import the nltk package
import nltk

# call the nltk downloader
nltk.download()

# 2. load data
file = open("C:/Users/hpatel/Downloads/programming_assignment/Text1.txt", 'rt')
text = file.read()
file.close()

# split into words
from nltk.tokenize import word_tokenize
tokens = word_tokenize(text)

# convert to lower case
tokens = [w.lower() for w in tokens]

# 3. remove punctuation from each word
import string
table = str.maketrans('', '', string.punctuation)
stripped = [w.translate(table) for w in tokens]

# remove remaining tokens that are not alphabetic
words = [word for word in stripped if word.isalpha()]

# 4. filter out stop words
file1 = open("C:/Users/hpatel/Downloads/programming_assignment/stopwords.txt", 'rt')
text1 = file1.read()
stop_words = set(text1.split())
words = [w for w in words if w not in stop_words]
print(words)

# 5. stemming of words
from nltk.stem.porter import PorterStemmer
porter = PorterStemmer()
stemmed = [porter.stem(word) for word in words]
print(stemmed)

# 6. Compute the frequency for each stem words into their root form and print out the 20 most words in descending order (do not include the stop words)
import itertools
all_words_nsw = list(itertools.chain(stemmed))
import collections
counts_nsw = collections.Counter(all_words_nsw)
counts_nsw.most_common(20)

