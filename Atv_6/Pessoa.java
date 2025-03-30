public class Pessoa {
    private String name;
    private int age;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void falar(){
    System.out.println("Olá, meu nome é "+ name + " e tenho " + age + " anos.");
    }


}
