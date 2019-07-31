/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/7/31 15:11
 * Description: 剑指offer第二题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject2;


/**
 * 〈使用string自带replaceAll方法〉<br>
 * 〈剑指offer第二题
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”〉
 *
 * @author think
 * @create 2019/7/31
 * @since 1.0.0
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
        String s = string.replaceAll(" ", "%20");
        //消除空格放入string数组
        //String[] strings = string.split("\\s+");
        return s;
    }
}
