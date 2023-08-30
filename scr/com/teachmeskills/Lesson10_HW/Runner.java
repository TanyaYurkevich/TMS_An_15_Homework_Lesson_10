package com.teachmeskills.Lesson10_HW;

public class Runner {
    public static void main(String[] args) {
        Util_Doc doc = new Util_Doc("5556-kiTh-2598-abCm-8u9p");
        Util_Doc doc1 = new Util_Doc("1246-kiNh-2498-tiEm-8r7p");

        String s = Util_Doc.outputFirstBlock(doc.DocNumber);
        String s1 = Util_Doc.outputFirstBlock(doc1.DocNumber);
        System.out.println(s + s1);
        String s2 = Util_Doc.replaceLetters(doc1.DocNumber);
        System.out.println(s2);
        Util_Doc.outputLetters1(doc1.DocNumber);
        Util_Doc.outputLetters2(doc.DocNumber);
        Util_Doc.checkCharactersDoc(doc1.DocNumber);
        Util_Doc.checkStartEnd(doc.DocNumber);
        String s3 = Util_Doc.printMaxLongWorld("I like to study!");
        System.out.println(s3);
        String s4 = Util_Doc.printMinLongWorld("I like to study!");
        System.out.println(s4);
        Util_Doc.duplicateCharacters("The end!");
    }
}
