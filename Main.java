package org.learnings;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var lonelyInteger = new LonelyInteger();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(3);
        System.out.println(lonelyInteger.lonelyinteger(list));
    }
}