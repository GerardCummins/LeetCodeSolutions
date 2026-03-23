class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char check =s.charAt(i);
            if(check=='('||check=='['||check=='{'){
            stack.push(s.charAt(i));
            }   else if(stack.isEmpty()==true){
                return false;}
                else if(check==')'&&stack.peek()=='('){
                stack.pop();   
            }   else if(check==']'&&stack.peek()=='['){
                stack.pop(); 
            }   else if(check=='}'&&stack.peek()=='{'){
                stack.pop();  
            }   else{
                return false;
            }
        }
        return stack.isEmpty();

        
    }
}