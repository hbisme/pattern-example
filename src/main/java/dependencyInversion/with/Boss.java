package dependencyInversion.with;

 public abstract  class Boss {

     private Staff staff;

     public Boss(Staff staff) {
         this.staff = staff;
     }

    abstract void support();
    abstract void askHelp(Boss boss);

     public Staff getStaff() {
         return staff;
     }

     public void setStaff(Staff staff) {
         this.staff = staff;
     }
 }
