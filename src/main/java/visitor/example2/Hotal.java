package visitor.example2;

import java.util.ArrayList;
import java.util.List;

public class Hotal {
    private List<Company> companies = new ArrayList<>();

    public void entertain(Vistor vistor) {
        for (Company company : companies) {
            company.accept(vistor);
        }
    }

    public void add(Company company) {
        companies.add(company);
    }


}
