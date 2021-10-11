package com.company.calcium_collision;

public class Main {

    public static void main(String[] args) {

        eraseSpace("      dsfsdf           привет        sdf        sdf    уго     ");

    }

    public static void eraseSpace(String sentence) {

        // Delete forward spaces
        while (sentence.charAt(0) == ' '){
            sentence = sentence.substring(1,sentence.length());
        }

        // Delete last spaces
        while (sentence.charAt(sentence.length()-1) == ' '){
            sentence = sentence.substring(0,sentence.length()-1);
        }

        // Delete middle spaces
        String[] arraySentence = sentence.split("");
        String cleanSentence = "";
        boolean previousSpace = false;
        for (int l = 0; l < arraySentence.length; l++){
            if (arraySentence[l].equals(" ")) {
                if (!previousSpace) {
                    cleanSentence += arraySentence[l];
                    previousSpace = true;

                }
            } else {
                cleanSentence += arraySentence[l];
                previousSpace = false;
            }
        }

        System.out.println(cleanSentence);
    }

}