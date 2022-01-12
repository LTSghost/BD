trips = [[2,1,5],[3,3,7]]
capacity = 4

# print(trips[0][0])
total = []
for i in trips:
    total.append(i[2])
max_d = max(total)
del total[:]

for i in range(max_d+1):
    total.append(0)


for i in range(len(trips)):
    print(trips[i][0])
    for j in range(trips[i][2]-trips[i][1]):
        total[i]
    # for j,k in enumerate(trips[i][1:3]):

print(total)