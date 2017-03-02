package code;

public class ExcelSheetCloumSheet168 {
	public String convertToTitle(int n) {
		StringBuffer result = new StringBuffer();
		while (n != 0) {
			result.append((n - 1) % 26 + 'A');
			n = (n - 1) / 26;
		}
		result.reverse();
		return result.toString();
	}

}
