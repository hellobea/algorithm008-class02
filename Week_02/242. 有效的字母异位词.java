/**
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

示例 1:

输入: s = "anagram", t = "nagaram"
输出: true
示例 2:

输入: s = "rat", t = "car"
输出: false
说明:
你可以假设字符串只包含小写字母。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-anagram
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/

//  这种方法不能全检测
//  class Solution {
//     public boolean isAnagram(String s, String t) {
//        if( s.length() != t.length() ) return false;
//         char[] str1 = s.toCharArray();
//         char[] str2 = t.toCharArray();
//         Arrays.sort(str1);
//         Arrays.sort(str2);
//         return Arrays.equals( str1 ,str2 );
//     }
// }


class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length() )  return false;
        int[] counter = new int[26];
        //主要思想：构造一个counter[26] 代表26个英文字母，s中有ASCII-‘a’则置为1；t有，置为0
        for( int i = 0; i < s.length(); i++ ){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for( int count : counter ){
            if( count != 0 )    return false;
        }
        return true;
    }
}
