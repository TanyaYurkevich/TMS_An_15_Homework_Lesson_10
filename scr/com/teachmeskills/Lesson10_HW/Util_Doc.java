package com.teachmeskills.Lesson10_HW;

public class Util_Doc {
    private String DocNumber;
    private String DocText;


    public Util_Doc() {
    }
    public Util_Doc(String docNumber) {
        DocNumber = docNumber;
    }
    public String getDocNumber() {
        return DocNumber;
    }

    public static String outputFirstBlock(String docNumber) {
        return docNumber.substring(0, 4) + " " ;
    }

    public static String replaceLetters(String docNumber) {
        return docNumber.replaceAll("[A-Za-z]", "*");
    }

    public static void outputLetters1(String docNumber) {
        String[] arrayString = docNumber.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(arrayString[1]);
        sb.append("/");
        sb.append(arrayString[3]);
        sb.append(arrayString[4].replaceAll("[0-9]","/"));

        System.out.println(sb.toString().toLowerCase());
    }

    public static void outputLetters2(String docNumber) {
        String[] arrayString = docNumber.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(arrayString[1]);
        sb.append("/");
        sb.append(arrayString[3]);
        sb.append(arrayString[4].replaceAll("[0-9]","/"));

        System.out.println("Letters: " + sb.toString().toUpperCase());
    }

    public static boolean checkCharactersDoc(String docNumber) {
        if (docNumber.toLowerCase().toLowerCase().contains("abc")) {
            System.out.println("abc");
        }else {
            System.out.println("Нет данной комбинации");
        }
        return true;
    }

    public static boolean checkStartEnd(String docNumber){
        if(docNumber.startsWith("555")){
            System.out.println("555");
        }
        if (docNumber.toLowerCase().toUpperCase().endsWith("1a2d")){
            System.out.println("1a2d");
        }
        return false;
    }

    public static String printMaxLongWorld(String docText) {
        String[] words = docText.split(" ");
        String MaxWord = "";
        for (String word : words) {
            if (word.length() > MaxWord.length()) {
                MaxWord = word;
            }
        }
        return MaxWord;
    }

    public static String printMinLongWorld(String docText){
        String[]words = docText.split(" ");
        String MinWord =words[0];
        for (String word:words){
            if (MinWord.length()>word.length()) {
                MinWord = word;
            }
        }return MinWord;
    }

    public static void duplicateCharacters(String docText){
        StringBuilder sb=new StringBuilder();
        for (char c:docText.toCharArray()){
            sb.append(c);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
