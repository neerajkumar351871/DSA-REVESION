import java.util.*;

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
       int left=1;
       int right=n;
       int fdb=-1;
       while(left<=right)
       {
        int mid=left+(right-left)/2;
        boolean  res=isBadVersion(mid);
        if(res)
        {
            fdb=mid;
            right=mid-1;
        }
        else
        {
            left=mid+1;
        }

       }
       return fdb; 
    }
}