 #CCC '14 S1 - Party Invitation
 
Original PDF:  https://github.com/livictor66-png/CCC-practice-Java-answer/blob/main/practice/ccc14s1.en.pdf
 
 思路
1，取第一行K, 将1-K放入map(hashmap)

2,   取第二行 R，for循环 i = 0  à  r-1

              取接下来的行，例如i=0时  2和2的 倍数位置的数字将从map中移除

                                               I= 1时，移除后的map, 位置为3的也被清除

               所以就做一个函数，将行值r和map传进去，返回移除数据后的map，这样就可以了


