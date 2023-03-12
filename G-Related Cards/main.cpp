#include <bits/stdc++.h>
using namespace std;
int main() {
    int n;
    cin>>n;
    long long v[n];
    for(int i = 0; i < n; i++)
    {
        cin>>v[i];
    }
    sort(v,v + n);
    reverse(v,v + n);
    vector<long long> ans;
    for(int i = 0; i < n - 1; i++)
    {
        if(v[i] != v[i + 1] + 1)
        {
            ans.push_back(v[i]);
        }
        else
        {
            i++;
        }
    }
    if(ans.size() == 1) ans.push_back(v[n - 1]);
    cout<< ans[1] << " " << ans[0] << endl;
    return 0;
}