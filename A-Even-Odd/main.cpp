#include <bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int v[n];
        int even,odd;
        even = odd = 0;
        for(int i = 0; i < n; i++)
        {
            cin>>v[i];
            even += v[i] % 2 == 0;
            odd += v[i] % 2;
        }
        cout<< even << " " << odd << endl;

    }
    return 0;
}