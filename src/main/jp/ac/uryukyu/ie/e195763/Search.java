package jp.ac.uryukyu.ie.e195763;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 複数の単語からしりとり作成。
 */
public class Search {
    /**
     * 引数の文字二つが同じかを判定
     * @param char1 比較したい文字
     * @param char2 比較したい文字
     * @return 同じならtrue,違えばfalse
     */
    static boolean isMatch(char char1,char char2) {
        if(char1 == char2){
            return true;
        }else {
            return false;
        }
    }

    /**
     * ２つのリストの要素からしりとりとして繋がるものを結合
     * @param array　単語のリストを要素に持つリスト
     * @param array1　単語のリストを要素に持つリスト
     * @param array2　単語のリストを要素に持つリスト
     */
    static void make(ArrayList<ArrayList<String>> array, ArrayList<ArrayList<String>> array1, ArrayList<ArrayList<String>> array2) {
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                if (array.get(j).get(0).equals(array1.get(i).get(array1.get(i).size() - 1))) {
                    ArrayList<String> resultSub = new ArrayList<>();
                    for (int k = 0; k < array1.get(i).size(); k++) {
                        resultSub.add(array1.get(i).get(k));
                    }
                    for (int k = 0; k < array.get(j).size(); k++) {
                        resultSub.add(array.get(j).get(k));
                    }
                    Set<String> set = new LinkedHashSet<>();
                    for (int k = 0; k < resultSub.size(); k++) {
                        set.add(resultSub.get(k));
                    }
                    ArrayList<String> str = new ArrayList<>(set);
                    array2.add(str);
                }
            }
        }
    }

    /**
     * しりとり最長パターンを探して出力
     * @param array　make()で作った最後のリスト
     */
    static void maxsearch(ArrayList<ArrayList<String>> array) {
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