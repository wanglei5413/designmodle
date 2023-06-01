Singleton单例模式
确保只生成一个实例

分为：
饿汉式:类初始化时创建实例

懒汉式：调用getInstance方法创建
为了线程安全和并发性考虑,使用DCL(double check lock)
为了禁止new 对象时指令重排序，使用volatile