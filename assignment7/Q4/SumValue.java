

public class SumValue {

   
    /*get sum of an array using 4 threads*/
    static long sum(int[] arr){
        public static long sumAll = 0;
        if(arr.length = 0 || arr == null) return sumAll;
        
        int[] arr1 = Arrays.copyOfRange(arr, 0, 1000000);
        int[] arr2 = Arrays.copyOfRange(arr, 1000000, 2000000);
        int[] arr3 = Arrays.copyOfRange(arr, 2000000, 3000000);
        int[] arr4 = Arrays.copyOfRange(arr, 3000000, 4000000);
        
        MyThread t1 = new MyThread(arr1);
        MyThread t2 = new MyThread(arr2);
        MyThread t3 = new MyThread(arr3);
        MyThread t4 = new MyThread(arr4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t1.join();
        t1.join();
        t1.join();
        
        return sumAll;
        
    }
    
    public static void main(String[] args){
        
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
    
     
    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){
        Random random = new Random(1000);
        for(int i = 0 ; i < arr.length; i++) {            
            arr[i] = random.nextInt();
        }
    }

}

public class MyThread extends Thread {
    private int[] arr;
    MyThread(int[] arr) {
        this.arr = arr;
    }
   
    @Override
    void run() {
        synchronized (LOCK) {
            for (int i = 0; i < arr.length; i++) {
                sumAll += arr[i];
            }
        }
        
    }
}
