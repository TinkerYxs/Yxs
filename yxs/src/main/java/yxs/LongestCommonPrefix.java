/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  LongestCommonPrefix.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��4��6�� ����4:35:23   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: LongestCommonPrefix
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��4��6�� ����4:35:23
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class LongestCommonPrefix {

	/**
	 * @Title: LongestCommonPrefix @Description:
	 * TODO(������һ�仰�����������������) @param: @throws
	 */
	public LongestCommonPrefix() {
		// TODO Auto-generated constructor stub
	}

	public String longestCommonPrefix(String[] strs) {
		String result = "";

		if (strs.length != 0) {

			result = strs[0];

			if (strs.length > 1) {
				for (int i = 1; i < strs.length; i++) {
					StringBuilder s = new StringBuilder();
					int length = 0;
					if (result.length() <= strs[i].length()) {
						length = result.length();
					} else {
						length = strs[i].length();
					}
					int j = 0;
					while (j < length) {
						if (result.charAt(j) == strs[i].charAt(j)) {
							s.append(result.charAt(j));
							j++;

						} else {
							break;
						}
					}
					result = "" + s;
				}

			}
		}

		return result;

	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
