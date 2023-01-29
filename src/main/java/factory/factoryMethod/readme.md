## 工厂方法模式
在工厂方法模式中,不再由单一的工厂类(简单工厂模式)生产产品,而是由工厂类的子类实现具体产品的创建.
因此当增加一个产品时,只需要增加一个对应的工厂类的子类.


### 优点
灵活性强,对于新产品创建,只需多写一个对应的工厂类

### 缺点
类的个数容易过多.

抽象产品只能生产一种产品,此弊端可使用抽象工厂模式解决.