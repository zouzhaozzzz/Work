package test.question1;

public class Teacher implements Comparable<Teacher>{
    String name;
    int age;
    double salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Teacher() {
    }

    public static void main(String[] args) {
        Teacher[] arr = { new Teacher("赵国栋", 54, 9000), new Teacher("马华", 76, 8900), new Teacher("三儿子", 34, 7800),
                new Teacher("你带事", 34, 8800), new Teacher("刘哥", 23, 1200) };
        // 排序前
        System.out.println("排序前");
        for (Teacher teacher : arr) {
            System.out.print(teacher);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                Comparable s1=arr[i];
                Comparable s2=arr[j];
                if (s1.compareTo(s2)>0){
                    Teacher temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (Teacher teacher : arr) {
            System.out.print(teacher);
        }
    }

    @Override
    public int compareTo(Teacher o) {
       if (age!=o.age){
         return -(age-o.age);
       }else {
        return Double.compare(salary,o.salary);
       }
    }
}

