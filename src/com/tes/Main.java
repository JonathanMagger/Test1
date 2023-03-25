package com.tes;

class Main {
    private int[] queue;
    private int front, rear, size;

    public Main(int capacity) {
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == queue.length);
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        front = (front + 1) % queue.length;
        int data = queue[front];
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[(front + 1) % queue.length];
    }
}
