/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/23 9:55
 * Description: 2*1矩形覆盖2*n矩形的问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject10;

/**
 * 〈一句话功能简述〉<br> 
 * 〈2*1矩形覆盖2*n矩形的问题
 *  找规律后发现仍然是斐波那契数列〉
 *
 * @author think
 * @create 2019/8/23
 * @since 1.0.0
 */
public class Solution {
    public int RectCover(int target) {
        if (target <= 0){
            throw new RuntimeException();
        }else if (target == 1){
            return 1;
        }else if (target == 2){
            return 2;
        }else {
            return RectCover( target - 1) + RectCover(target - 2);
        }
    }
}
