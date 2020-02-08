package jp.ac.uryukyu.ie.e195763;

import java.util.ArrayList;

import static jp.ac.uryukyu.ie.e195763.Search.make;
import static jp.ac.uryukyu.ie.e195763.Search.maxsearch;
import static jp.ac.uryukyu.ie.e195763.Search.isMatch;


public class Main {
    public static void main(String args[]) {

        String[] dataset = {"gori", "ice", "easy", "egg", "apple"};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<ArrayList<String>> resclone = new ArrayList<>();
        ArrayList<ArrayList<String>> resclone1 = new ArrayList<>();
        ArrayList<ArrayList<String>> resclone2 = new ArrayList<>();
        for (int i = 0; i < dataset.length; i++) { //datasetをリストに変換
            list.add(dataset[i]);
        }
        for (int i = 0; i < list.size(); i++) { //リストの単語同士で繋いでペアを作る
            for (int j = 0; j < list.size(); j++) {
                if (isMatch(list.get(j).charAt(0), list.get(i).charAt(list.get(i).length() - 1))) {
                    ArrayList<String> resultSub = new ArrayList<>();
                    resultSub.add(list.get(i));
                    resultSub.add(list.get(j));
                    if(list.get(i).equals(list.get(j))){ //はじめと終わりが同じ文字を処理
                    }else{
                        result.add(resultSub); //それ以外を別のリストの加える。
                    }
                }
            }
        }
        make(result, result, resclone);
        make(result, resclone, resclone1);
        make(result, resclone1, resclone2);

        maxsearch(resclone2);

    }
}
