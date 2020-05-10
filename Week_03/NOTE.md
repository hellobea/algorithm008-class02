递归 Recursion

注意：
不要人头递归
找到最近最简方法，将其拆解成可重复解决的问题(重复子问题)
数学归纳法思维


递归代码模板：
public void recur(int level,int param){
    //terminator 递归终结条件
    if(level > MAX_LEVEL){
    //process result
    return ;
    }

    //process current logic 处理当前逻辑
    process(level,param);

    //drill down 下探到下一层
    recur(level+1，newParam);

    //restore current status 清理当前层
}

递归思考：
思 考，自顶向下编程，按照模板
再考虑约束条件（剪枝）

实战题目：爬楼梯、括号生成 题解看leetcode


问题本质：
1. 重复性
2. 拆分为重复子问题
3. 重复子问题组合

分治思想：将问题拆分为子问题，最后子结果合并。
分治代码模板
    def divide_conquer(problem,para1,param2,...):
    #recursion terminator
    if problem is None:
        print_result
        return
    
    #prepare data
    data = prepare_data(problem)
    subproblems = split_problem(problem,data)

    #conquer subproblems
    subresult1 = self.divide_conquer(subproblems[0],p1,...)
    subresult2 = self.divide_conquer(subproblems[1],p1,...)
    subresult3 = self.divide_conquer(subproblems[2],p1,...)
    ...
    #process and generate the final result
    result = process_result(subresult1,subresult2,subresult3,...)

    #revert the current level states

回溯思想
采用试错的思想，尝试分步地去解决一个问题
在分步解决问题的过程中，发现现有分步结果无效时，将取消上一步甚至几步的计算
再通过其他可能的分步方式再次尝试解决

结果：
1.找到一个可能存在正确答案
2.尝试了所有可能分步后，没有答案

实战题目：八皇后、pow(n,x)、 题解看leetcode

