/*
Input format
6 4 // number of words in magazine, number of words in ransomNote
give me one grand today night //Words present in magazine
give one grand today // Words present in ransomNote

Output: Gives true if all the words in ransomNote are in magazine, else false
*/

import java.util.*;

public class HashMapRansomNote {
    Map<String, Integer> magazineMap;
    private String magazine, note;

    public HashMapRansomNote(String magazine, String note) {
        this.magazine = magazine;
        this.note = note;
        magazineMap = new HashMap<String, Integer>();
    }

    public boolean solve(){
        Integer i=0;
        boolean isValid = true;

        for(String word : magazine.split(" ")){
            i = magazineMap.get(word);
            if(i==null){
                magazineMap.put(word,1);
            }
            else{
                magazineMap.put(word,i+1);
            }
        }

        for(String word1 : note.split(" ")){
            i = magazineMap.get(word1);
            if(i==null || magazineMap.get(word1)==0){
                isValid = false;
                break;
            }
            else{
                magazineMap.put(word1, i-1);
            }
        }

        return isValid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        HashMapRansomNote s = new HashMapRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
