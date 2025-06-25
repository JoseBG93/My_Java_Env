package com.holamundocourse.classes;

public class for_each {
    public static void main(String[] args) {
    String[] animeCharacters = {"Naruto", "Goku", "Luffy", "Ichigo", "Saitama", "Tanjiro", "Eren", "Deku"};
    
    // This is the traditional for loop
    for (int i = 0; i < animeCharacters.length; i++) {
        System.out.println(animeCharacters[i]);
    }

    // This is the for each loop
    for (String character : animeCharacters) {
        System.out.println(character);
    }
}
}