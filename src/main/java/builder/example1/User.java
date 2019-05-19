package builder.example1;

public class User {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    private User(Builder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.sex = userBuilder.sex;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
    }


    public static class Builder {

        //必选
        private String firstName;
        //必选
        private String lastName;
        //可选
        private String sex = "男";
        //可选
        private int age = 21;
        //可选
        private String phone = "无";

        // 构造器的构造方法,填入必选的字段
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /* 下面的字段设置是可选的 */
        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


    public static void main(String[] args) {

        // 使用构造器创建对象的时候,就可以只设置必要的参数
        User user1 = new Builder("hu", "bin").build();
        System.out.println(user1);

        // 在设置必要的参数后面,还可以设置其他参数
        User user2 = new Builder("fang", "shuling")
                .sex("女")
                .age(20)
                .phone("123456")
                .build();
        System.out.println(user2);

    }
}
