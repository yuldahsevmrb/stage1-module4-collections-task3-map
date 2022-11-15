package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        sentence = sentence.replaceAll(",","");
        sentence = sentence.replace(".", "");

        StringTokenizer str = new StringTokenizer(sentence, " ");
        Map<String, Integer> wordRepetition = new HashMap<>();
        while (str.hasMoreTokens()){
            String word = str.nextToken().toLowerCase();
            if(wordRepetition.containsKey(word)){
                wordRepetition.put(word, wordRepetition.get(word) + 1);
            } else {
                wordRepetition.put(word, 1);
            }
        }
        return wordRepetition;
    }
}
