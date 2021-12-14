#include <bits/stdc++.h>

using namespace std;

int reverse_int(int n)
{
    int reversedNumber = 0, remainder;

    while (n != 0)
    {
        remainder = n % 10;
        reversedNumber = reversedNumber * 10 + remainder;
        n /= 10;
    }

    return reversedNumber;
}

bool isPalindrome(int i)
{
    return i == reverse_int(i);
}

int main()
{
    for (int i = INT_MIN; i <= INT_MAX; i++)
    {
        if (isPalindrome(i))
        {
            cout << i << endl;
        }
    }

    return 0;
}
