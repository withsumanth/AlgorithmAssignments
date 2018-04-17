package AlgoTest;

import java.util.Stack;

public class DijkstrasAlgo {

	public static void main(String[] args) {
		Stack<String> oper = new Stack<String>();
		Stack<Double> num = new Stack<Double>();
		String [] str = {"(","1","+","(","(","2","+","3",")","*","(","4","*","5",")",")",")"};
		for(String s:str) {
			if(s.equals("(")){ 
				
			}else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				oper.push(s);
			}else if (s.equals(")")) {
				String op = oper.pop();
				Double d = num.pop();
				if(op.equals("+")){
					d = d+num.pop();
				}else if(op.equals("-")) {
					d = num.pop()-d;
				}else if(op.equals("*")) {
					d = num.pop()*d;
				}else if(op.equals("/")) {
					d = num.pop()/d;
				}
				num.push(d);
			}else {
				num.push(Double.parseDouble(s));
			}
		}
		System.out.println(num.pop());
	}

}
