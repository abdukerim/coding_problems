def rotate(l,d):
    k = l.index(d)
    new_list = []
    new_list = l[k+1:] + l[0:k+1]
    return new_list

if __name__ == '__main__':
    arr = [1,2,3,4,5]
    arr = rotate(arr,3)
    for i in arr:
        print(i, end='')
