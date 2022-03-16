tolur = [83,69,65,82,67,72,88,77,80,76]

outTolur = []
M = 9
while (True):
    M+=1
    print(M)
    for a in range(1,1000000):
        for k in tolur:
            outTolur.append((a*k)%M)
        if(len(set(outTolur))==10): break
        outTolur = []
    if(len(set(outTolur))==10): break

print('outSet',set(outTolur))
print('outTolur',outTolur)
print('a',a)
print('M',M)