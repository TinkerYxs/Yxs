/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  LengthOfLongestSubstring.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��4��6�� ����4:28:52   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LengthOfLongestSubstring
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��4��6�� ����4:28:52
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class LengthOfLongestSubstring {

	/**
	 * @Title: LengthOfLongestSubstring @Description:
	 *         TODO(������һ�仰�����������������) @param: @throws
	 */
	public LengthOfLongestSubstring() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstring(String s) {

		int length = s.length();
		StringBuilder sb = new StringBuilder();
		List<String> sList = new ArrayList<String>();
		int flag = 0;
		int j = 0;
		int begin = 0;
		for (int i = 0; i < length; i++) {

			flag = 0;
			j = begin;

			while (j < i) {

				if ((s.charAt(i)) == (s.charAt(j))) {

					flag = 1;
					sList.add("" + sb);

					sb = new StringBuilder();
					for (int k = j + 1; k <= i; k++) {
						sb.append(s.charAt(k));
					}

					begin = j + 1;

					break;
				} else {
					j++;
				}

			}
			if (flag == 0) {
				sb.append(s.charAt(i));

				if (i == s.length() - 1) {

					sList.add("" + sb);
				}
			}

		}

		int maxLength = 0;
		if (sList.size() > 0) {
			maxLength = sList.get(0).length();
		}
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).length() > maxLength) {
				maxLength = sList.get(i).length();
			}
		}
		return maxLength;

	}
}
