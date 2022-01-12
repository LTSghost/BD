trips = [[2,1,5],[3,3,7]]
capacity = 4
total = []

for i in trips:
    total.append(i[2])
max_d = max(total)
print(max_d)
del total[:]
total = [0] * max_d+1

for ltrips in trips:
    for i in range(trips[1],trips[2]):
        total[i] += trips[0]
return max(total) <= capacity


# [222]   capacity=4
#    3