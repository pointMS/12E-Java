package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        byte[] bites = new byte[]{1,2,3,-1,-2,2,1,4,1,2,1,-7,1,-1,-1};

        //System.out.println(wordCounter(bites));
        Word[] words= getWords(bites);
        System.out.println(Arrays.toString(words));

    }

    public static Word[] getWords(byte[] array){
        Word[] wordsArray = new Word[wordCounter(array)];
        int wordSum=0;
        int j=0;
        for(int i=0; i<array.length;i++){
            if (array[i]<0){
                if(wordSum>0){
                   wordsArray[j]= new Word(wordSum);
                   wordSum=0; j++;
                }
            }else{
                wordSum+=array[i];
            }
        }
        if(wordSum>0){
            wordsArray[j]= new Word(wordSum);
        }
        return wordsArray;
    }

    public static int wordCounter(byte[] array){
        int wordCount=0;
        int wordLength=0;
        for (int i=0; i<array.length;i++){
            if (array[i]<0){
                if (wordLength>0){
                    wordCount ++;
                    wordLength=0;
                }
            }else{
                wordLength ++;
            }
        }
        if (wordLength>0){
            wordCount ++;
        }
        return wordCount;
    }
}
