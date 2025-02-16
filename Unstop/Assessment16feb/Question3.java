// Problem Statement
// In the enchanted forest of Snoopville, the wise owl known as Orlon is the guardian of the mystical treasure. Every year, Orlon holds a challenge to find the worthy adventurer who can solve the riddles of the forest and earn the treasure.

// The challenge is simple but requires both wit and knowledge of the forest’s magical rules. The adventurer must speak a word aloud within 5 seconds after the bell rings. However, only those who meet the conditions of the forest will qualify for the treasure hunt.

// To qualify for the next round of the challenge, the word spoken by the adventurer must:

// Contain at least 2 vowels.
// The number of consonants in the word must be a perfect square of a prime number (from the sequence: 2^2, 3^2, 5^2, 7^2, 11^2, 13^2, 17^2, 19^2,.......).
// if the word has no consonants, the adventurer will be disqualified.
// As the judge of the challenge, your task is to determine whether each adventurer qualifies for the next stage based on their word.

// Input Format
// The only line of input contain a single word consisting of uppercase or lowercase alphabets.

// Output Format
// Print "Qualify" if the adventurer qualifies, otherwise print "Disqualify".
import java.util.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String word=sc.next();
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int vowelCount= 0;
        int consonantCount=0;
        for(char c: word.toCharArray()){
            if(Character.isLetter(c)){
                if(vowels.contains(c)){
                    vowelCount++;
                }else{
                    consonantCount++;
                }

            }
        }
        if(vowelCount<2){
            System.out.println("Disqualify");
            return;
        }
        Set<Integer> validSquares=new HashSet<>(Arrays.asList(4,9,25,49,121,169,289,361));
        if(consonantCount==0||!validSquares.contains(consonantCount)){
           System.out.println("Disqualify"); 
        }else{
            System.out.println("Qualify");
        }
    }
}


