
/* Пусть дан список сотрудников: 
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, 
Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, 
Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, 
Петр Петин, Иван Ежов. 

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */

import java.util.Map;
import java.util.TreeMap;

public class Task_2 {
    public static void main (String [] args) {
        String text = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        Map <String, Integer> map = createTreeMap(text);
        showMap(map);
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
    static void showMap(Map <String, Integer> smap) {
        
        for (Map.Entry <String, Integer> entry : smap.entrySet()) {
            for (Map.Entry <String, Integer> entry2 : smap.entrySet()) {
                if (entry.getValue() > entry2.getValue()) {
                    
                }
            }
        }
        
        

        for (Map.Entry <String, Integer> entry : smap.entrySet()) {            
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}