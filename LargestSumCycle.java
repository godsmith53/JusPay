/*Given a maze with N cells. Each cell may have multiple entry points but not more than one exit(i.e entry/exit points are unidirectional doors like valves).
You are given an array Edge[] of N integers, where Edge[i] contains the cell number that can be reached from of cell i in one step. Edge[i] is -1 if the ith cell doesn't have an exit. 
The task is to find the largest sum of a cycle in the maze(Sum of a cycle is the sum of the cell indexes of all cells present in that cycle).

Note:The cells are named with an integer value from 0 to N-1. If there is no cycle in the graph then return -1.

Example 1:

Input:
N = 4
Edge[] = {1, 2, 0, -1}
Output: 3
Explanation: 
There is only one cycle in the graph.
(i.e 0->1->2->0)
Sum of the cell index in that cycle 
= 0 + 1 + 2 = 3.
Example 2:

Input:
N = 4 
Edge[] = {2, 0, -1, 2}
Output: -1
Explanation:
1 -> 0 -> 2 <- 3
There is no cycle in the graph.

Your task:
You dont need to read input or print anything. Your task is to complete the function largestSumCycle() which takes the integer N denoting the number of cells and the array Edge[] as input parameters and returns the sum of the largest sum cycle in the maze.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
-1 < Edge[i] < N
Edge[i] != i */

class Solution{
    long ans=-1;
    public long largesSumCycle(int N, int Edge[]){
        int[] vis=new int[N];
        int[] visP=new int[N];
        
        for(int i=0;i<Edge.length;i++){
            if(vis[i]==0){
                dfs(i,Edge,vis,visP);
            }
        }
        return ans;
    }
    public void dfs(int node,int Edge[],int[] vis,int[] visP){
        vis[node]=1;
        visP[node]=1;
        
        if(Edge[node] != -1){
            int adj=Edge[node];
            if(vis[adj]==0){
                dfs(adj,Edge,vis,visP);
            }else if(visP[adj]==1){
                int currNode=adj;
                int sum=0;
                do{
                    sum+=currNode;
                    currNode=Edge[currNode];
                }while(currNode != adj);
                
                ans=Math.max(ans,sum);
            }
        }
        visP[node]=0;
    }
    
}