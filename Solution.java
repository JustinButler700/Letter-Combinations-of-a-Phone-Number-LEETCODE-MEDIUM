// Justin Butler 10/26/2021
class Solution {
     String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
     List<String> out = new ArrayList<>();
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0){return(new ArrayList<String>());}
        recursion(digits, "", 0);
        return out;
        
    }
  //Helper method to recursively find all permutations on our digits
    public void recursion(String digits, String prefix, int index)
    {
        if(index >= digits.length())
        {
            out.add(prefix);
            return;
        }
        else
        {
            String letters = map[Character.getNumericValue(digits.charAt(index))];
            {
                for(int i = 0; i < letters.length(); i++)
                {
                    recursion(digits, prefix+letters.charAt(i), index+1); // String permuation = current char + all other chars
                }
            }
        }
        return;
    }
}
