对象结构
对象头+实例数据+填充字节
对象头：MarkWord+ClassPoint
MarkWord:
ClassPoint:指向JVM内存结构中的方法区中的类型数据
MarkWord:存储当前对象运行时状态有关的的信息，比如说hasshcode,锁状态标志指向所记录的指针记录等
锁状态的有关物理存储
![img.png](img.png)
