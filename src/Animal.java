public abstract class Animal {
    private int strength;
    private int speed;
    private String name;
    private int age;


    public String eat() {
        return "";
    }

    public void eat(String text){

    }

    void sleep() {

    }

    public String setName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int setAge(){
        return age;

    }
    public void setAge(int age){
        this.age=age;
    }

}