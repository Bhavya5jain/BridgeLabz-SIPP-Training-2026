package coreJavaPractice.story_based_problem;

class Citizen{
    String name;
    int salary;

    public Citizen(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public float taxBracket(){
        if(salary<10000){
            return 5;
        }else if (salary>=10000 && salary<=50000){
            return 15;
        } else {
            return 30;
        }
    }

    public void print(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(taxBracket());
    }
}

public class Day2_taxSystem {
    public static void main(String[] args) {
        Citizen[] citizens = new Citizen[10];
        int[]salary = new int[]{10000,20000,30000,40000,50000,60000,70000,80000,20000,30000};
        String[]name = new String[]{"ram","shyam","bhavya","mukesh","bhavtosh","satvik","ankit","gopal","nikita","anjili"};
        for (int i = 0; i < 10 ; i++) {
            citizens[i]=new Citizen(name[i],salary[i]);
        }
        float sum=0;
        for (int i = 0; i < citizens.length ; i++) {
            float tax = (citizens[i].taxBracket()/100)*citizens[i].salary;
            sum+=tax;
        }
        System.out.println(sum);
    }
}
