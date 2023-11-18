package binarySearch;

/**
 * Project : algorithm3
 * Created by OKESTRO
 * Developer : th.eom
 * Date Time : 2023/11/18 9:20 PM
 * Summary :
 **/
public class BinarySearch {

    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = i;


        Tree t = new Tree();
        t.makeTree(a);
        t.searchBTree(t.root, 2);
    }
}


