package visitor.example2;

public class VisitorTest {
    public static void main(String[] args) {
        AlibabaCompany alibabaCompany = new AlibabaCompany();
        TencentCompany tencentCompany = new TencentCompany();

        ProvincialLeaderVistor provincialLeaderVistor = new ProvincialLeaderVistor();
        NationalLeaderVistor nationalLeaderVistor = new NationalLeaderVistor();

        Hotal hotal = new Hotal();
        hotal.add(alibabaCompany);
        hotal.add(tencentCompany);

        hotal.entertain(provincialLeaderVistor);
        hotal.entertain(nationalLeaderVistor);
    }
}
