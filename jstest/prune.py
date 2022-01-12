


def prune(rope,meter):
    return prune(rope / 2 ,meter) + 1 if rope > meter else 0












if __name__ == "__main__":
    rope = 3000
    meter = 5
    day = prune(rope,meter)
    print(day)