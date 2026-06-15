package story_based_problem;

class CodingGuild{
    String name;
    int age;
    String rank;
    int salary;
    float membership_fee;

    public CodingGuild(String name, int age, String rank, int salary, float membership_fee) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.salary = salary;
        this.membership_fee = membership_fee;
    }

    public int annualBonus(){
        return (int)(this.salary*0.12);
    }

    public void Welcome(){
        System.out.println("We welcome you " + name);
        System.out.println("----------Details--------");
        System.out.println("age: " + age);
        System.out.println("rank: "+ rank);
        System.out.println("salary: "+ salary);
        System.out.println("membership fee: "+membership_fee);
    }
}

public class Day1_Ravi_Welcome_card {
    public static void main(String[] args) {
        CodingGuild Ravi = new CodingGuild("Ravi",21,"II",50000,250);
        Ravi.Welcome();
    }
}
