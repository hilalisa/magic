void dfs(int v, int[][] p, bool[] visited)
    if visited[v]
        return
    visited[v] = true
    for i in p[v]
        dfs(i, p, visited)

void main()
    n = readInt()
    m = readInt()

    v = [[]]*n

    for i in [0:m]
        a = readInt()
        b = readInt()

        v[a] += b
        v[b] += a

    visited = [false]*n

    components = 0

    for i in [0:n]
        if (!visited[i])
            components++
            dfs(i, p, visited)
