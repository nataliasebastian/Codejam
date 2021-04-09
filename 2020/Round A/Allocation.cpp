#include <iostream>
#include <algorithm>
using namespace std;

int main()
{

    int test; 
    cin >> test; 

    for (int t=1; t<=test; t++) {
			
			int n, b;
            cin >> n >> b;
			int arr[n];
            

            for (int j=0; j<n; j++) {
				cin >> arr[j];
			}

            sort(arr, arr+n);

            int result=0;
			int sum=0;

            int p=0;
            while (sum<b && p<n){
                if (sum+arr[p]<=b){
                    sum+=arr[p];
                    result++;
                    p++;
                }

                else{
                    sum=b;
                }
            }

    cout << "Case #" << t <<  ": " << result << endl;
        
            
           
    }

}

