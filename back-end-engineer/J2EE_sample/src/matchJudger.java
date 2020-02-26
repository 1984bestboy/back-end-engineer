import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class matchJudger {
// pair�H�k�A����key, ���A������
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
			if (pair.containsValue(ch)){// �p�G�O���A���A��J�̤�
				sc.push(ch);
			} else if (pair.containsKey(ch)){ // �p�G�O�k�A��
				if (sc.empty()) { // �̬��šA���Y�S���r���P�k�A���ǰt	
					return false;
				}
				// �̤����šA���Y�r���P�k�A���ǰt
				if (sc.peek() == pair.get(ch)) {
					sc.pop();
					count++;
				}	
//				} else {
//					// ���W�\�h�C�l�S���o�̪�else�{���X���A�ɭP({}[]]])�|�Q�P�_��true
//					// �̤����šA���Y�r�����P�k�A���ǰt
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