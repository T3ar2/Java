import java.util.Scanner;

class Student{
    private String name;
    private int score1;
    private int score2;
    private int score3;
    private double total;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public int getScore3() {
        return score3;
    }

    public String getName() {
        return name;
    }

    void Media(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score 1: ");
        setScore1(scanner.nextInt());
        System.out.println("Score 2: ");
        setScore2(scanner.nextInt());
        System.out.println("Score 3: ");
        setScore3(scanner.nextInt());

        setTotal(( getScore1() + getScore2() + getScore2()) / 3);

        System.out.print( getName() + " your media  is " + getTotal() + " and ");
        if (getTotal() > 60.00){
            System.out.print("YOU PASSED!!!");
        }
        else{
            System.out.print("You failed.");
        }
    }


}
