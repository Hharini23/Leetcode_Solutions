class Solution:
    def countPaths(self, n: int, roads: List[List[int]]) -> int:
        adj = defaultdict(list)
        for u, v, w in roads:
            adj[u].append((w, v))
            adj[v].append((w, u))

        minheap = [(0, 0)] #cost, node
        min_cost = [float("inf")] * n
        path_count = [0] * n
        path_count[0] = 1
        mod = 10 ** 9 + 7

        while minheap:
            cost, node = heappop(minheap)

            for nei_cost, nei in adj[node]:
                new_cost = cost + nei_cost
                if new_cost < min_cost[nei]:
                    min_cost[nei] = new_cost
                    path_count[nei] = path_count[node]
                    heappush(minheap, ((new_cost, nei)))
                elif new_cost == min_cost[nei]:
                    path_count[nei] = (path_count[nei] + path_count[node]) % mod
        return path_count[n-1]


        