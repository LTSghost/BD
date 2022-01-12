

def prime(rg):
    for i in range(2,rg+1):s
        if i==2:
            print(i)
            continue
        elif i%2 == 0: continue
        else:
            for j in range(2,i):
                if i%j==0: break
                elif j+1 == i: print(i)









if __name__ == "__main__" :
    rg = int(input("Please Enter Maximum: "))
    prime(rg)