/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayqueue;



public class ArrayQueue  {
    private int[] queue = new int[5];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }

        rear++;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int value = queue[front];
        front++;
        size--;
        return value;
    }
    
    public int peek() {
    if (size == 0) {
        System.out.println("Queue is empty!");
        return -1;
    }
    return queue[front];
}
    public boolean isEmpty() {
    return size == 0;
}
    public int size() {
    return size;
}

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.size();
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
   

