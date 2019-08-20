package dependencyInversion.without;

 public abstract  class Boss {
    abstract void support();
    abstract void askHelp(Boss boss);
}
