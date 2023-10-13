// I corrected this from four years ago. This is a MergeSort. Education really does help with my understanding but I also went back and study these Algorithm along with Selection Sort, Insertion Sort.

    class MergeSort{  
    
           public void Merging(int a[], int low,int mid,int high){
                 int left_counter = mid - low+1;
                int right_counter = high - mid;
                
                int l_arr[] = new int[left_counter];
                int r_arr[] = new int[right_counter];
                
                for(int i = 0; i < left_counter; ++i){
                    l_arr[i]= a[low + i]; 
                
                }
                
                for( int i = 0; i< right_counter; ++i){
                    r_arr[i] = a[mid+1+ i];
                
                }
                
                int left, right, org;
                left= 0;
                right = 0;
                org = low;
                
                while(left < left_counter && right < right_counter){
                    if(l_arr[left] < r_arr[right]){
                        a[org] = l_arr[left];
                        ++left;
                    }
                    else{
                        a[org] = r_arr[right];
                        ++right;
                    }
                    ++org;
                }
                
                
                while(left< left_counter){
                    a[org] = l_arr[left];
                    ++left;
                    ++org;
                }
            
                while(right < right_counter){
                    a[org] = r_arr[right];
                    ++right;
                    ++org;
                
                
                }
            
            }
    
      public  void Merge(int arr[], int low, int high){
           
           
            if(low<high){
               int mid = (low+high)/2;
               Merge(arr,low, mid);
               Merge(arr, mid+1, high);
               Merging(arr,low,mid,high);
            
            }
        
        
        }
    
    
    
    
        public static void main(String args[]){
            MergeSort merg = new MergeSort();
            int a[] = {50,45,40,35,30,25,20,15,10,5,1}; 
            
            
            merg.Merge(a,0,a.length-1);
            
            for(int i =0; i<a.length; ++i){
                System.out.println(a[i]);
            }
            System.out.println("Hello Java"); 
            
         
          
        }  
    }  
