class PalindromeCheck {

public static String isPalindrom(String word) {

     String reverseStr = "";
    
    int wordLength = word.length();

    for (int i = (wordLength - 1); i >=0; --i) {
      reverseStr = reverseStr + word.charAt(i);
    }

    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
     // System.out.println(word + " is a Palindrome String.");
      return word + " is a Palindrome String.";
    }
    else {

      return word + " is not a Palindrome String.";
    }
  }


  public static void main(String[] args) {
 String text = isPalindrom("Denlaksskalned");
 System.out.println(text);
  }
}