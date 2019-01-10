#include <iostream>

using namespace std;

int main()
{
    for(int index = 1; index <= 100; index++)
    {
        if(index % 3 == 0)
        {
            cout << "Fizz";
        }
        if(index % 5 == 0)
        {
            cout << "Buzz";
        }
        if(!(index % 3 == 0) && !(index % 5 == 0))
        {
            cout << index;
        }
        cout << endl;
    }

    return 0;
}
