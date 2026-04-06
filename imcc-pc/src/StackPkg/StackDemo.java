package StackPkg;

import java.util.Stack;

public class StackDemo {
	
	Stack<Integer> stack=new Stack<Integer>();
	
	public void push(int a)
	{
		stack.push(a);
	}
	
	public int pop() throws Exception
	{
			if(stack.isEmpty())
			{
				throw new Exception("Stack is empty");
			}
			return stack.pop();
	}
	
	public int peek() throws Exception
	{
			if(stack.isEmpty())
			{
				throw new Exception("Stack is empty");
			}
			return stack.peek();
	}
	
	public int evaluatePostfix(String exp) throws Exception {

        for(int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if(Character.isDigit(ch)) {
                push(ch - '0');  // convert char to integer
            }
            else {

                int b = pop();
                int a = pop();

                switch(ch) {
                    case '+':
                        push(a + b);
                        break;

                    case '-':
                        push(a - b);
                        break;

                    case '*':
                        push(a * b);
                        break;

                    case '/':
                        push(a / b);
                        break;
                }
            }
        }
        return pop();
	}
}
