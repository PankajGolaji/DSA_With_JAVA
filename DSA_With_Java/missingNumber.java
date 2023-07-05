import java.util.ArrayList;
import java.util.List;

public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    int nums = [0,1,3,50,75], lower = 0, upper = 99;
    List<String> result = new ArrayList<>();

    // Check for missing numbers before the first element
    if (nums.length == 0 || nums[0] > lower) {
        result.add(formatRange(lower, nums[0] - 1));
    }

    // Check for missing numbers between elements
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > nums[i - 1] + 1) {
            result.add(formatRange(nums[i - 1] + 1, nums[i] - 1));
        }
    }

    // Check for missing numbers after the last element
    if (nums.length == 0 || nums[nums.length - 1] < upper) {
        result.add(formatRange(nums[nums.length - 1] + 1, upper));
    }

    return result;
}

private String formatRange(int start, int end) {
    if (start == end) {
        return String.valueOf(start);
    } else {
        return start + "->" + end;
    }
}
