# 实验说明
- 本实验使用**soot**工具`./sootclasses-trunk-jar-with-dependencies.jar`，对于Java程序进行生成部分SSA的`.shimple`文件的实验。
- 在Java中，栈上的变量为优化组，堆上的变量为不优化组。
## 栈上的优化组
- 在`./Soot2SSA.java`文件中，栈上的变量为`main()`函数中的`int`类型变量`date`:
![](https://github.com/Weizerojust/SoftwareAT/blob/master/Pictures/stack.png?raw=true)

- 在生成的`./sootOutput/Soot2SSA.shimple`文件中，`date`被优化为`date`和`date_1`:
![](https://github.com/Weizerojust/SoftwareAT/blob/master/Pictures/Shimple_stack.png?raw=true)

## 堆上的不优化组
- 在`./Soot2SSA.java`文件中，堆上的变量为`BirthDate`类中的`int`类型变量`day`:
![](https://github.com/Weizerojust/SoftwareAT/blob/master/Pictures/heap.png?raw=true)

- 在生成的`./sootOutput/BirthDate.shimple`文件中，`day`未被优化:
![](https://github.com/Weizerojust/SoftwareAT/blob/master/Pictures/Shimple_heap.png?raw=true)
