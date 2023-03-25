package com.array7;

class MyThread extends Thread {
    private int[] data;

    public MyThread(int[] data) {
        this.data = data;
    }

    public void run() {
        // Loop for dengan data yang diberikan
        for (int i = 0; i < data.length; i++) {
            // Proses data
            System.out.println("Data ke-" + i + ": " + data[i]+Thread.currentThread().getName());

            // Tunggu 100ms sebelum proses data berikutnya
            
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};

        // Buat tiga thread dengan data yang sama
        MyThread thread1 = new MyThread(data);
        MyThread thread2 = new MyThread(data);
        MyThread thread3 = new MyThread(data);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");
        
        // Start ketiga thread secara bersamaan
        thread1.start();
        thread2.start();
        thread3.start();

        // Tunggu hingga ketiga thread selesai
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
