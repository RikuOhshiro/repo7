package jp.ac.uryukyu.ie.e195763;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class SearchTest {

    @Test
        void maxsearch(ArrayList<ArrayList<String>> array) {

        int max = 0;
        int num = 0;
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i).size()) {
                max = array.get(i).size();
                num = i;
            }
        }
        System.out.print("開始");
        for (int i = 0; i < array.get(num).size(); i++) {
            System.out.printf("->%s", array.get(num).get(i));
        }
        System.out.println("->終了");
    }
    
}