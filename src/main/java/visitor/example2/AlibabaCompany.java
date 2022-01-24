package visitor.example2;

public class AlibabaCompany extends Company {
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

    public String entertainBelowProvincialLeader(String leader) {
        return "Alibaba 接待" + leader + "：十菜一汤";
    }

    public String entertainAboveNationalLeader(String leader) {
        return "Alibaba 接待" + leader + "：十四菜两汤";
    }

}
