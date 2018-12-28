package kitt16053886.ac.in.piratereporter;

public class Employee {

    String xid;
    String name;
    String email;
    String Details;
    String artist;
    String problemo;
    String num;

    public Employee(){

    }

    public Employee(String empid, String name, String desig, String cug, String rphone,String problemo,String num) {
        this.xid = empid;
        this.name = name;
        this.email = desig;
        this.Details = cug;
        this.artist = rphone;
        this.problemo= problemo;
        this.num=num;
    }

    public String getxid() {
        return xid;
    }

    public String getName() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public String getProblemo() {
        return problemo;
    }

    public String getNum() {
        return num;
    }

    public String getDetails() {
        return Details;
    }

    public String getartist() {
        return artist;
    }


}
