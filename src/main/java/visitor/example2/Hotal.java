package visitor.example2;

import java.util.ArrayList;
import java.util.List;

public class Hotal {
    private List<CompanyVisitable> companies = new ArrayList<>();

    public void add(CompanyVisitable companyVisitable) {
        companies.add(companyVisitable);
    }

    public void entertain(Vistor vistor) {
        for (CompanyVisitable companyVisitable : companies) {
            companyVisitable.accept(vistor);
        }
    }

}
