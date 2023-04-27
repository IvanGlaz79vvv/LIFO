package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new Queue<>();
        for (int i = 0; i < 10; i++) {
            list.push(i);
        }
        System.out.println(list);
        while (!list.isEmpty()) {
            list.pop();
            System.out.println(list);
        }

    }
}
