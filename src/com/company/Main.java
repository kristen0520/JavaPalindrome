package com.company;

public class Main {

    public static void main(String[] args) {
	 isPalindrome(99);
	 isPalindrome(1234);
	 isPalindrome(-1001);
    }

    public static boolean isPalindrome(int number){
        if(number < 0){
            number = number - number - number;
        }
        String numString = "" + number;
        String backwardsNumString = "";
        for(String i : numString.split("")){
            backwardsNumString = i + backwardsNumString;
        }
        if(backwardsNumString.equals(numString) ) {
            System.out.println(numString + " is a palindrome");
            return true;
        }
        System.out.println(numString + " is not equal to " + backwardsNumString);
        return false;
    }
}
