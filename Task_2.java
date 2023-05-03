/* Пусть дан список сотрудников: 
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, 
Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, 
Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, 
Петр Петин, Иван Ежов. 

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task_2 {
    public static void main (String [] args) {
        String text = "Иван Иванов, Иван Иванов, Светлана Петрова, Анна Мусина, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Анна Мусина, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Петр Петин, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        Map <String, Integer> map = createTreeMap(text);
        shoSortedMap(map);
    }
    static Map <String, Integer> createTreeMap(String text) {
        TreeMap <String, Integer> treeMap = new TreeMap<String, Integer>();
        String word = "";
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && word == "") {
                continue;
            }
            else if(text.charAt(i) != ',') {
                word += text.charAt(i);
            }
            else {
                if (treeMap.containsKey(word)) {
                    count += treeMap.get(word);
                    treeMap.put(word, count);   
                    word = "";
                    count = 1;          
                } else {
                    treeMap.put(word, count);
                    word = "";
                    count = 1;
                }
            }
        }
        return treeMap;
    }
    static void shoSortedMap(Map <String, Integer> map) {
        List <String> listS = new ArrayList<String>();
        List <Integer> listI = new ArrayList<Integer>();        
        for (Map.Entry <String, Integer> entry : map.entrySet()) {
            listS.add(entry.getKey());
            listI.add(entry.getValue());
        }
        int temp = 0;
        String word = "";
        for (int i = 0; i < listI.size(); i++) {            
            for (int j = 0; j < listI.size(); j++) {
                if (listI.get(i) > listI.get(j)) {
                    temp = listI.get(j);
                    listI.set(j, listI.get(i));
                    listI.set(i, temp);
                    temp = 0;

                    word = listS.get(j);
                    listS.set(j, listS.get(i));
                    listS.set(i, word);
                    word = "";
                }
            }
        }
        for (int k = 0; k < listI.size(); k++) {
            System.out.println(listS.get(k) + " - " + listI.get(k));
        }
    }
}