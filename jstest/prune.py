

def prune(rope,meter):
    if rope > meter :
        rope /= 2
        return prune(rope,meter) + 1
    return 0

    # return prune(rope / 2, limit_length) + 1 if rope > limit_length else 0

# def Cir_stop(m):
#     if (m > 3):
#         return Cir_stop(m-1)+1
#     else:
#         return 1





if __name__ == "__main__" :
    rope = 3000
    meter = 5
    day = prune(rope,meter)
    print(day)
    # Cir_stop(meter)
    