animals = ['cat', 'dog', 'blobfish', 'shark', 'owl', 'toad']

def check_animal(name):
    for i in animals:
        if i == name:
            return(f"{name} is in the list")
        return(f"{name} isn't in the list")

print(check_animal('cat'))
print(check_animal('penguin'))