 #CCC '14 J3 - Double Dice
 
 original PDF: 
 https://github.com/livictor66-png/CCC-practice-and-answer/blob/main/practice/ccc14j3.en.pdf
 
 按照输入值，取得每次输入的值

Antonia à 0      David  à 1

定义一个数组, points[0]是Antonia的分数，points[1]是David的分数

int[] points = new int[]{100,100};

 

循环处理输入的每一行，

用split分成两个INT  : intA intB

做一个函数getMax , 返回最大值 maxvalue

 

做一个函数judgeDice判断哪个大

Int whichone  = judgeDice(int intA, int intB)：



前面的大就返回1，后面的大就返回0，相同就返回-1

Antonia大        David大          相同

 

if (whichone  >=0 ){

       points[whichon] - maxvalue

}

循环完毕，输入points[0] / points[1]