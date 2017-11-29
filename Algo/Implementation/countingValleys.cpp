#include <iostream>
#include <cstdio>
#include <string>
#include <sstream> 
#include <vector>
#include <set>
#include <map>
#include <queue>
#include <stack>
#include <cmath>
#include <algorithm>
#include <cstring>
#include <ctime>
#include <cassert>
using namespace std;

typedef long long ll;

const int MINN = 2;
const int MAXN = 1e6;

int main()
{

    int n; 
    cin >> n;
    assert(n >= MINN && n <= MAXN);
    string s;
    cin >> s;
    assert(s.length() == n);
    int res = 0;
    int level = 0;
    FOR(i, n)
    {
        if(s[i] == 'D')
        {
            --level;
        }
        else if(s[i] == 'U')
        {
            ++level;
            if(level == 0) ++res;
        }
    }
    assert(level == 0);
    cout << res << endl;
}
