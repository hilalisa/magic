
void main()
    n = readInt()
    int[] p

    for i in [0:n]
        p += (readInt())

    for i in [0:n]
        for j in [i+1:n]
            if p[i] > p[j]
                t = p[i]
                p[i] = p[j]
                p[j] = t

    for v in p
        printInt(v)
