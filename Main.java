package com.company.calcium_collision;

public class Main {

    // почитать что такое final
    // что происходит с final псолле компиляции
    final static String doubleSpace = "  ";
    final static String space = " ";

//    final static String doubleSpace;
//    final static String space;
//
//    static {
//        doubleSpace = "  ";
//        space = " ";
//    }


    public static void main(String[] args) {

        String rawString = "      dsfsdf           привет        sdf        sdf    уго     ";

        String trimmedString = trimmedString(rawString);
        String validString = removeDoubleSpaces(trimmedString);

        System.out.println(validString);

//        eraseSpace("      dsfsdf           привет        sdf        sdf    уго     ");

    }

    private static String trimmedString(String value) {
        return value.trim();
    }

    /**
     * recorcive method
     * любой цикл можно рпедставить в виде рекурсии
     */
    private static String removeDoubleSpacesRecursive(String value) {
        if (value.contains(doubleSpace)) {
            String passedValue = value.replace(doubleSpace, space);
            return removeDoubleSpacesRecursive(value.replace(doubleSpace, space));
        } else {
            return value;
        }
    }

    private static String removeDoubleSpaces(String value) {
        String str = value;
        while (str.contains(doubleSpace)) {
            str = str.replace(doubleSpace, space);
        }
        return str;
    }

    public static void eraseSpace(String sentence) {

        // Delete forward spaces
        while (Character.isSpace(sentence.charAt(0))){
            sentence = sentence.substring(1, sentence.length());
        }

        // Delete last spaces
        while (sentence.charAt(sentence.length() - 1) == ' '){
            sentence = sentence.substring(0, sentence.length() - 1);
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