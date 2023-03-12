#include <bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin>>t;
    string A[t];
    for(int i = 0; i < t; i++)
    {
        cin>>A[i];
    }
    int n;
    cin>>n;
    string s[n];
    map<string,int> mp;
    for(int i = 0; i < n; i++)
    {
        cin>>s[i];
        mp[s[i]]++;
    }
    for(auto ele : mp)
    {
        cout<< ele.first << " ";
    }
    cout<<endl;
    for(auto ele : mp)
    {
        cout<<ele.second << " ";
    }
    cout<<endl;
    return 0;

}