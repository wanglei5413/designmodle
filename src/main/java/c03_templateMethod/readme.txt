Template Method模板方法模式
父类定义流程框架，具体处理交给子类。

例子：
AQS中的aquire方法，定义获取同步器的流程（tryAquire->addwaiter->aquireQueued），
tryAquire方法是一个抽象方法，父类并未实现，功能是尝试获取同步器，具体怎么获取同步器交给子类实现。
