/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution2
 * Author:   think
 * Date:     2019/7/31 15:36
 * Description: 使用循环方式遍历stringBuffer
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈使用循环方式遍历stringBuffer〉
 *
 * @author think
 * @create 2019/7/31
 * @since 1.0.0
 */
public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            if (b == ' '){
                stringBuffer.append("%20");
            }else{
                stringBuffer.append(b);
            }
        }
        return stringBuffer.toString();
    }
}
