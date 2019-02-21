package controller;

import java.util.ArrayList;
import java.util.List;

public class BubbleController {
    private List<Integer> temp = new ArrayList<>();

    public List<Integer> sortASC(List<Integer> list) {
        temp = list;
        // pętla iterująca po testach
        for (int i = 1; i < temp.size(); i++) {
            // pętla iterująca po wartściach listy
            for (int j = 1; j < temp.size(); j++) {
                if (temp.get(j - 1) > temp.get(j)) {
                    swap(j - 1, j);
                }
            }
            System.out.println(i + " " + temp);
        }
        return temp;
    }
    // metoda zamieniająca miejscami wartości na wskazanych indeksach
    public void swap(int index1, int index2){
        int tempIndex = temp.get(index1);
        // wprowadzam wartość dla index2 w miejsce index1
        temp.set(index1, temp.get(index2));
        // wprowadzam wartość dla index1 w miejsce index 2
        temp.set(index2, tempIndex);
    }
//    public List<Integer> sortDESC(List<Integer> list){
//        temp = list;
//    }

}
