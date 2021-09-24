mkk = input("Meðallun karla fyrir skatt: ")
mkvk = input("Meðallun kvenna fyrir skatt: ")
ke = input("Kyn einstaklings, kk eða kvk: ")
me = input("Meðallaun einstaklings: ")

if ke == "kk":
    if (float(me) < float(mkk)):
        print("Undir meðallaunum")
    else:
        print("Yfir meðallaunum")

elif ke == "kvk":
    if (float(me) < float(mkvk)):
        print("Undir meðallaunum")
    else:
        print("Yfir meðallaunum")