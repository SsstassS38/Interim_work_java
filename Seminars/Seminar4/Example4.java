package Seminars.Seminar4;

/*
    1) Написать метод, который принмиает массив элементов, помещает их в стэк и выводит в консоль содержимое стэка.
    2) Написать метод, который принмиает массив элементов, помещает их в очередь и выводит в консоль содержимое очереди.
*/

import java.util.*;

public class Example4 {
    
    public static void main(String[] args) {
        Integer[] arr= new Integer[]{1,2,3,4,5,6,7};
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        printStack(stack);
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));
//        printQueue(queue);
        printStackWithIterator(stack);
    }

    static void printStack(Stack<Integer> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    static void printQueue(Queue<Integer> queue){
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void printStackWithIterator(Stack<Integer> stack){
        ListIterator<Integer> iterator = stack.listIterator(stack.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
