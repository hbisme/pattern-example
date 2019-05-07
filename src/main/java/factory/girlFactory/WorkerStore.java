package factory.girlFactory;


/**
 * 典型的工厂模式,
 * WorkerStore 商店中有 Factory 接口,
 * 先创建具体的Factory,再用它实例化WorkerStore,
 * WorkerStore 将参数传入 Factory 来实例化最终的对象
 */
public class WorkerStore {
    private Factory factory;

    public WorkerStore(Factory factory) {
        this.factory = factory;
    }

    public Girl createGirl(String type) {
        return factory.createGirl(type);
    }

    public static void main(String[] args) {
        Girl girl1 = new WorkerStore(new ChinaFactory()).createGirl("thin");
        System.out.println(girl1);

        Girl girl2 = new WorkerStore(new AmericanFactory()).createGirl("thin");
        System.out.println(girl2);


    }


}


interface Factory {

    Girl createGirl(String type);
}


// 具体的工厂也可以扩展

class ChinaFactory implements Factory {

    @Override
    public Girl createGirl(String type) {

        if (type.equals("fat")) {
            return new ChineseFatGirl();
        } else if (type.equals("thin")) {
            return new ChineseThinGirl();
        } else {
            return null;
        }
    }

}


class AmericanFactory implements Factory {

    @Override
    public Girl createGirl(String type) {

        if (type.equals("fat")) {
            return new AmericanFatGirl();
        } else if (type.equals("thin")) {
            return new AmricanThinGirl();
        } else {
            return null;
        }
    }

}


class Girl {

}

// 具体的类,可以扩展

class ChineseFatGirl extends Girl {
}

class ChineseThinGirl extends Girl {

}

class AmericanFatGirl extends Girl {
}

class AmricanThinGirl extends Girl {

}


