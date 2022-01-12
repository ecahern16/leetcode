package com.erinahern;

public class FirstBadVersion278 {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n - 1;
        int mid = (left + right)/2;
        while (left <= right){
            if (isBadVersion(mid) == false){
                if(isBadVersion(mid+1) == true){
                    return mid+1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (isBadVersion(mid-1) ==false){
                    return mid;
                }
                right = mid - 1;
            }
            mid = (left + right)/2;
        }
        return 0;
    }

    boolean isBadVersion(int version) {
        if (version > 12){
            return true;
        } else {
            return false;
        }
    }
}
