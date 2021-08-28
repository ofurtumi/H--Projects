import os

strArray = []
strOut = ""
linuFjoldi = int(input("Fjöldi lína í kóðabitanum: "))
print("Pastaðu kóðabitanum sjálfum: ")

def addToClipBoard(text):
    command = "echo " + text + "| clip"
    os.system(command)
    

i = 0
for i in range(linuFjoldi):
    strArray.append(input())
    if (i+1) < linuFjoldi:
        strArray[i] += "\\n"

print(strArray)

for i in strArray :
    strOut += i 

strOut = strOut.replace('"','\\"')

addToClipBoard(strOut)