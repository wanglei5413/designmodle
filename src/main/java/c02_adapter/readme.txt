adapter适配器模式
填补现有程序和所需程序之间差异。

两种实现方式：
类适配器（使用继承的适配器）
对象适配器（使用委托的适配器）

比如：
1、Stack栈的操作，就是通过继承vector，调用vector中现有程序来实现所需的栈操作。

2、HashSet底层使用HashMap来存取元素，Entry.key存的是元素，Entry.value都存同一个Object对象，
   HashMap是现有程序，Set是所要需求，HashSet就是两者之前的适配器。


使用场景：
1、现有程序和需求之间有一定差异
2、版本升级后兼容老版本