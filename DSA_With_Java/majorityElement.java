import java.util.*;

// Greedy Approach
public class majorityElement{
static int printMajority(int arr[]){

    int maj = arr[0], majCount = 1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]==maj){
            majCount++;
        }
        else{
            majCount--;
            if(majCount == 0){
                maj = arr[i];
                majCount = 1;
            }
        }
    }
    return maj;
}
public static void main(String[] args) {
    int arr[] = {2,1,2};
    System.out.println(printMajority(arr));

    int arr1[] = {2,2,4,4,4,4};
    System.out.println(printMajority(arr1));
}
}