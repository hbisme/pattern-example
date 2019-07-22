package builder.example2;

// 电脑城老板委派任务给装机人员（Director）
public class Director {
    public void Construct(Builder builder) {
        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }
}
