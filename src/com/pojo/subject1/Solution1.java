/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2019/7/31 14:01
 * Description: 采用二分查找，时间复杂度nlogn
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈采用二分查找,由于每一行数组都是单调递增的，故可以使用二分查找，时间复杂度 nlogn〉
 *
 * @author think
 * @create 2019/7/31
 * @since 1.0.0
 */
public class Solution1 {
    public boolean find(int target,int [][] array){
        for (int i = 0; i < array.length; i++) {
            int top = array[i].length - 1;
            int bottom = 0;
            while (bottom <= top){
                int middle = (top + bottom) / 2;
                if (array[i][middle] > target){
                    top = middle - 1;
                }else if (array[i][middle] < target){
                    bottom = middle + 1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
