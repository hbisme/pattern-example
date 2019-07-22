package command.example1;

public interface Command {
    // 执行命令操作
    void exec();

    // 反执行命令操作
    void unexec();
}
