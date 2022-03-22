package DoublyQueue;

import QueueWithArray.Queue;

public class DoublyQ <E> implements Queue<E> {
    DoublyLinkedList<E> list=new DoublyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.last();
    }

    @Override
    public void enqueue(E element) {
        list.addFirst(element);
    }

    @Override
    public E dequeue() {
        return list.removeLast();
    }
}
