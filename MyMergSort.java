public class MyMergSort {
    public void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("\t" + arr[i]);
        }
    }

    public void Proccess(int[] arr, int low, int median) {
        low = 0;
        median = arr.length / 2;
        Sort(arr, low, median, median);
        low = median;
        median = arr.length - 1;
        Sort(arr, low, median, median);
        low = 0;
        Sort(arr, low, arr.length - 1, arr.length);
        // median = arr.length-1;
        // Sort(arr,low,median);
    }

    public void Sort(int[] arr, int low, int end, int counter) {
        if (arr.length == 1) {
            System.out.println("Only one item is in the list, it is sorted!");
            return;
        }
        for (int i = low; i < end; ++i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        if (counter >= 0) {--counter;
            Sort(arr, low, end, counter);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {
            14,
            33,
            27,
            10,
            35,
            19,
            42,
            44
        };
        MyMergSort sort = new MyMergSort();
        System.out.println("My Custom MergSort");
        sort.Proccess(array, 0, 0);
        sort.PrintArray(array);
    }
}