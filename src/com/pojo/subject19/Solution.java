/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/9/10 15:55
 * Description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject19;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字〉
 *
 * @author think
 * @create 2019/9/10
 * @since 1.0.0
 */
public class Solution {
    ArrayList result = new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;

        while (tR <= dR&&tC <= dC){
            printEdge(matrix,tR++,tC++,dR--,dC--);
        }
        return result;
    }

    public void printEdge(int[][] matrix,int tR,int tC,int dR, int dC){
        if (dR == tR){
            for (int i = tC; i <= dC; i++) {
                result.add(matrix[tR][i]);
            }
        }else if (dC == tC){
            for (int i = tR; i <= dR; i++) {
                result.add(matrix[i][tC]);
            }
        }else{
            int curR = tR;
            int curC = tC;

            while (curC != dC){
                result.add(matrix[tR][curC]);
                curC++;
            }

            while (curR != dR){
                result.add(matrix[curR][dC]);
                curR++;
            }
            while (curC != tC){
                result.add(matrix[dR][curC]);
                curC--;
            }
            while (curR != tR){
                result.add(matrix[curR][tC]);
                curR--;
            }
        }
    }
}
