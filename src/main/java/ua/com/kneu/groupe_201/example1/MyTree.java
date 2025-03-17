package ua.com.kneu.groupe_201.example1;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());

        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        TreeSet<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        treeSet2.add(4);
        treeSet2.add(5);
        treeSet2.add(6);
        treeSet2.add(7);

        System.out.println(treeSet);
        System.out.println(treeSet2);

        // спільна область
        TreeSet<Integer> treeSet3 = new TreeSet<>(treeSet);
        treeSet3.retainAll(treeSet2);
        System.out.println(treeSet3);

        //
        TreeSet<Integer> treeSet4 = new TreeSet<>(treeSet);
        treeSet4.removeAll(treeSet2);
        System.out.println(treeSet4);

        TreeSet<Integer> treeSet5 = new TreeSet<>(treeSet);
        treeSet5.addAll(treeSet2);


    }

}
