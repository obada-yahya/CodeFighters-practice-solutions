#include <bits/stdc++.h>
using namespace std;
int main() {
    int n;
    cin>>n;
    char characters[n];
    int pos[n];

    for(int i = 0; i < n; i++)
    {
        cin>>characters[i];
    }
    for(int i = 0; i < n; i++)
    {
        cin>>pos[i];
    }
    string s(n,'0');
    for(int i = 0; i < n; i++)
    {
        s[pos[i] - 1] = characters[i];
    }
    cout<< s << endl;
    return 0;
}