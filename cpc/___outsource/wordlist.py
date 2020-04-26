import requests

url = 'https://random-word-api.herokuapp.com/word?number='

file_ = open("wordlist.txt", "w")

number_of_word = 10000

response = requests.get(url + str(number_of_word))

data = response.json()

for d in data:
    file_.write(d + "\n")

file_.close()
