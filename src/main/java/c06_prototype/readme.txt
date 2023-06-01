Prototype原型模式
根据实例来生成实例

会用到Object.clone方法，
要使用Object.clone方法，类必须implements Cloneable接口，可以不实现。
若不实现，直接继承Object.clone()是浅克隆--开辟相同大小内存空间，将原实例中字段值复制到新开空间，若字段是引用类型直接复制的是引用地址。
若不想浅克隆，可以重写clone方法。