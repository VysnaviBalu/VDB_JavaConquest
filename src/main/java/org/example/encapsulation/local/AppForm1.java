package org.example.encapsulation.local;

public class AppForm1 {
    private String homeroomTeacherName;
    private int standard;
    private String major;

    public AppForm1(String homeroomTeacherName, int standard, String major){
        this.homeroomTeacherName = homeroomTeacherName;
        this.standard = standard;
        this.major = major;
    }

    public String getHomeroomTeacherName(){return homeroomTeacherName;}
    public String getMajor(){ return major;}
    public int getStandard(){return standard;}

    @Override
    public String toString(){
        return "Teacher: " + homeroomTeacherName+
                ", Major: "+ major+
                ", Standard: "+standard;
    }

    public static void main(String[] args){
        AppForm vys = new AppForm("Vysh",1);
        AppForm1 vysDetails = new AppForm1("Mercy", 10, "ComputerScience");
        System.out.println(vys.getName());
        System.out.println(vysDetails);
        vys.display();

    }
}