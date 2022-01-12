package com.erinahern;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = 0;
        int m = 0;
        int count = 0;
        char c;
        char[] noteArr = ransomNote.toCharArray();
        char[] magArr = magazine.toCharArray();

        for (int j = 0; j < noteArr.length; j++){
            c = noteArr[j];
            for (int i = 0; i < magArr.length; i++){
                if (magArr[i] == c){
                    count ++;
                    magArr[i] = ' ';
                    break;
                }
            }
        }
        if (count == ransomNote.length()){
            return true;
        } else {
            return false;
        }
    }
}
