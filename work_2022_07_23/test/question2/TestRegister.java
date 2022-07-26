package test.question2;

public class TestRegister {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String name = "as2Adqwe2";
        String pwd = "adsW22fds";
        String id = "43092120010513321X";
        int age = 18;
        String sex = "female";

        try {
            if (judgeName(name) && judgePwd(pwd) && judgeId(id) && judgeAge(age) && judgeSex(sex)) {
                System.out.println("保存到数据库");
            } else throw new RuntimeException("信息异常");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static boolean judgeSex(String sex) {
        if ("male".equals(sex) || "female".equals(sex)) {
            return true;
        }
        System.out.println("性别信息不对");
        return false;
    }

    private static boolean judgeAge(int age) {
        if (age >= 0 && age < 200) return true;
        System.out.println("年龄信息不对");
        return false;
    }

    private static boolean judgeId(String id) {
        if (id.matches("\\d{17}[\\d|X]|\\d{15}")) return true;
        System.out.println("身份证信息不对");
        return false;
    }

    private static boolean judgePwd(String pwd) {
        if (pwd.matches("[a-zA-Z0-9,$]{8,}")) return true;
        System.out.println("密码信息不对");
        return false;
    }

    private static boolean judgeName(String name) {
        if (name.matches("[a-zA-Z0-9]{8,}")) return true;
        System.out.println("姓名信息不对");
        return false;
    }

}
