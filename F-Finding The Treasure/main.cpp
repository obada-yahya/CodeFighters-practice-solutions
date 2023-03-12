#include <bits/stdc++.h>
using namespace std;
#define fst ios::sync_with_stdio(0);cin.tie(0);
#define endl '\n'
int main() {
    int x,y;
    cin>>x>>y;
    char grid[x][y];
    pair<int,int> start, goal;
    for(int i = 0 ; i < x; i++)
    {
        for(int j = 0; j < y; j++)
        {
            cin>>grid[i][j];
            if(grid[i][j] == 'S')
            {
                start = {i,j};
            }
            if(grid[i][j] == 'X')
            {
                goal = {i,j};
            }
        }
    }
    cout<< abs(start.first - goal.first)  + abs(start.second - goal.second) << endl;
    return 0;

}