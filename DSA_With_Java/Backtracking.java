import java.util.*;

public class Backtracking {
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start)
    if(target<0)
    return;
    else if(target==0){
    result.add(new ArrayList<>(temp));
}
for(int i=start; i<candidates.length;i++)
{
    temp.add(candidates[i]);
    backtrack(result,temp,candidates,target-candidates[i],i);
    temp.remove(temp.size()-1);
}
}

public List<List<Integer>> combinationSum(int[] candidates, int target){
{
    List<List<Integer>> result = new Array<>();
    backtrack(result, new ArrayList<Integer>, candidates, target, 0);
    return result;
}

}