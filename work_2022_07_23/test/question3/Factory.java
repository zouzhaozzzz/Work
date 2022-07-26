package test.question3;

public class Factory {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        factory.createPhone("B");
    }
}


class PhoneFactory{
    public void createPhone(String type){
        Phone phone;
        switch (type){
            case "A":
               phone=new PhoneA();
                phone.show();
                break;
            case "B":
                phone=new PhoneB();
                phone.show();
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}

class PhoneB implements Phone{
    @Override
    public void show() {
        System.out.println("PhoneBBB");
    }
}

class PhoneA implements Phone{
    @Override
    public void show() {
        System.out.println("PhoneAAA");
    }
}

interface Phone{
    void show();
}