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

# filter out stop words
file1 = open("C:/Users/hpatel/Downloads/programming_assignment/stopwords.txt", 'rt')
text1 = file1.read()
stop_words = set(text1.split())
words = [w for w in words if w not in stop_words]
print(words)

# stemming of words
from nltk.stem.porter import PorterStemmer
porter = PorterStemmer()
stemmed = [porter.stem(word) for word in words]
print(stemmed)

import itertools
all_words_nsw = list(itertools.chain(stemmed))
import collections
counts_nsw = collections.Counter(all_words_nsw)
counts_nsw.most_common(20)

