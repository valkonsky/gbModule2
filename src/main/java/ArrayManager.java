public class ArrayManager {

    private static final int size = 10000000;
    private static final int h = size / 2;
    private float[] arr = new float[size];

    private void addOneForAllValues(){
        for (int i=0;i<arr.length;i++){
            arr[i] = 1;
        }
    }

    public void fillArray(){
        addOneForAllValues();
        long start = System.currentTimeMillis();
        for (int i=0;i<arr.length;i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public void synchFillArray(){
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        addOneForAllValues();
        long start = System.currentTimeMillis();
        System.arraycopy(arr,0,a1,0,h);
        System.arraycopy(arr,h,a2,0,h);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<a1.length;i++){
                    a1[i] =  (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<a1.length;i++){
                    a2[i] =  (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        thread.start();
        thread2.start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println("synchronyzed method finish");
        System.out.println(System.currentTimeMillis() - start);
    }
}
