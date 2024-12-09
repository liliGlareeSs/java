
x = int(input("Entrer votre X nombre: "))
y = int(input("Entrer votre Y nombre: "))

while x != y:
    print(f"x = {x}, y = {y}")


    if x < y:
        x += 1
    else:
        x -= 1

print(f"x == y, both are {x}")