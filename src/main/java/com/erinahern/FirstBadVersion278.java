package com.erinahern;

public class FirstBadVersion278 {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n - 1;
        int mid;
        int result = n;
        while (left <= right){
            mid = (left + right)/2;
            if (isBadVersion(mid) == true){
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    boolean isBadVersion(int version) {
        if (version > 1702766719){
            return true;
        } else {
            return false;
        }
    }
}
