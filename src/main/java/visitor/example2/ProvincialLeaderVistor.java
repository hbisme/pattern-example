package visitor.example2;

public class ProvincialLeaderVistor implements Vistor {
    @Override
    public void visit(AlibabaCompany alibabaCompany) {
        System.out.println(alibabaCompany.entertainBelowProvincialLeader("省领导"));

    }

    @Override
    public void visit(TencentCompany tencentCompany) {
        System.out.println(tencentCompany.entertainBelowProvincialLeader("省领导"));
    }
}
