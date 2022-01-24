package visitor.example2;

public class NationalLeaderVistor implements Vistor {

    @Override
    public void visit(AlibabaCompany alibabaCompany) {
        System.out.println(alibabaCompany.entertainAboveNationalLeader("国家领导人"));
    }

    @Override
    public void visit(TencentCompany tencentCompany) {
        System.out.println(tencentCompany.entertainAboveNationalLeader("国家领导人"));
    }
}
