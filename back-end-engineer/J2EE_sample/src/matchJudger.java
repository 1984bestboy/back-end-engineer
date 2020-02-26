import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class matchJudger {
// pair以右括號為key, 左括號為值
	private Map<Character, Character> pair = null;
	static int count=0;
	public matchJudger() {
		pair = new HashMap<Character, Character>();
		pair.put(')', '(');
		pair.put('}', '{');
		pair.put(']', '[');
	}

	public boolean isMatch(String s) {
		Stack<Character> sc = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (pair.containsValue(ch)){// 如果是左括號，放入棧中
				sc.push(ch);
			} else if (pair.containsKey(ch)){ // 如果是右括號
				if (sc.empty()) { // 棧為空，棧頭沒有字元與右括號匹配	
					return false;
				}
				// 棧不為空，棧頭字元與右括號匹配
				if (sc.peek() == pair.get(ch)) {
					sc.pop();
					count++;
				}	
//				} else {
//					// 網上許多列子沒有這裡的else程式碼塊，導致({}[]]])會被判斷為true
//					// 棧不為空，棧頭字元不與右括號匹配
//					return false;
//				}
			}
		}
		return sc.empty() ? true : false;
	}

	public static void main(String[] args) {
		matchJudger judger = new matchJudger();
//		System.out.println(judger.isMatch("(***)-[{-------}]")+"/n"+("count="+count)); // true
//		System.out.println(judger.isMatch("(2 4)*a[5]")+"/n"+("count="+count)); // true
//		System.out.println(judger.isMatch("({}[]]])")+"/n"+("count="+count)); // false
		System.out.println(judger.isMatch(")())))")+"/n"+("count="+count)); // false
	}
}