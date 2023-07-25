class Solution {
    public String[] findWords(String[] words) {
       String arr[] = { "qwertyuiop","asdfghjkl","zxcvbnm"}; 
     ArrayList<String>list = new ArrayList<>();

       for(int i = 0;i<3;i++){
           for(int j = 0; j<words.length;j++){
               String emp = "";
               String str = words[j].toLowerCase();
               for(int k = 0;k<str.length();k++){
                   String test = str.charAt(k)+"";
                    if(arr[i].contains(test)){
                        emp=emp+test;
                      //  System.out.println("emp===>"+emp);
                    }                   
               }
               if(emp.equals(str)){
                  list.add(words[j]);
               }
           }
       }
       String[] ans = new String[list.size()];
       for(int i = 0;i<list.size();i++){
           ans[i]=list.get(i);
       }
       return ans;
    }
}