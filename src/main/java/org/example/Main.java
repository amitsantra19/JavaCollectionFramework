package org.example;

public class Main {
    public static void main(String[] args) {
        ExampleArrayList.createStringArrayList();
        System.out.println();
        ExampleArrayList.removeStringArrayList();
        System.out.println();
        ExampleArrayList.addItemToArrayList(2,"MUM");
        System.out.println();
        ExampleArrayList.iterateArrayListUsingForeachLambda();
        ExampleArrayList arrayList = new ExampleArrayList();
        arrayList.arrayListObjectSortingExample();
    }
}