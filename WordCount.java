package com.psl.assignment.string;

public class WordCount {

	static int check(String sentence,String word){
		int i = 0,count = 0;
		String wordsInSentence[] = sentence.split(" ");
		int noOfWords = wordsInSentence.length;
		System.out.println("No of Words in the Sentence: " + noOfWords + "\nWords are:");
		while(i > noOfWords){
			if(wordsInSentence[i++].equals(word))
				count++;
			i++;
		}
		return count;
	}
	public static void main(String[] args) {
		String sentence = "And Nik is so Nikhil!";
		String word = "Nik";
		int numberOfOccurrence = WordCount.check(sentence, word);
		System.out.println("Occurences of " + word +" is: " + numberOfOccurrence);
	}
}




