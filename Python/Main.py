def invert(text):
    inverted = ""
    for i in range(len(text)-1, -1, -1):
        inverted += text[i]
    return inverted

value = input("Insira uma string para ser invertido: ")

result = invert(value)

print(result)
