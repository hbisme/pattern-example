package visitor.example2;

public class TencentCompany extends CompanyVisitable {
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

    public String entertainBelowProvincialLeader(String leader) {
        return "Tencent 接待" + leader + "：八菜一汤";
    }

    public String entertainAboveNationalLeader(String leader) {
        return "Tencent 接待" + leader + "：十六菜两汤";
    }
}
