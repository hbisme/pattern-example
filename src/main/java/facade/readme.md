### 外观模式

#### 定义
定义了一个高层,统一的接口,外部与通过这个统一的接口对子系统中的一群接口进行访问.

#### 主要作用
实现客户类与子类系统的松耦合.
降低原有系统的复杂度.
提高客户端使用的便携性,使得客户端无须关心子系统的工作细节,使用外观角色即可调用相关功能.

#### 优点
1. 只是提供了一个访问子系统的统一入口,并不影响用户直接使用子系统类
2. 减少了与子系统的关联对象,实现了子系统与客户之间的松耦合关系,使得子系统的组件变化不会影响到客户端.
3. 引入外观角色之后，用户只需要与外观角色交互

#### 缺点
1. 在不如抽象外观类的情况下,增加新的子系统可能需要修改外观类或者客户端类的源代码,违背了"开闭原则".
2. 不能很好地限制客户端使用子系统.

#### 应用场景
1. 要为一个复杂的子系统对外提供一个简单的接口.
2. 提供子系统的独立性.
3. 客户端与多个子系统存在很大的依赖性.
4. 在层次化结构中,可以使用外观模式定义系统中每一层的入口
(层与层之间不直接产生联系,而是通过外观类建立联系,降低层之间的耦合度)

#### 与适配器模式的区别
适配器模式是将一个对象包装起来以改变其接口,而外观模式是将一群对象"包装"起来,以简化其接口.
他们的意图不一样,适配器将接口转换为不同接口,而外观模式是提供一个统一的接口来简化接口.

#### 使用例子
小成的爷爷已经80岁了，一个人在家生活：每次起床看电视都需要 **打开灯**、**打开电视**、**打开空调**；睡觉时**关闭灯**、**关闭电视**、**关闭空调**；
冲突：行动不方便，走过去关闭那么多电器很麻烦.
使用外观模式,相当于有了一个多功能遥控器,在一个遥控器上操作灯,空调,电视.