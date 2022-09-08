package com.kh.vo;

public class MemberVO {
    public int getMemeber_Num() {
        return Memeber_Num;
    }

    public void setMemeber_Num(int memeber_Num) {
        Memeber_Num = memeber_Num;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirth() {
        return Birth;
    }

    public void setBirth(String birth) {
        Birth = birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getRecommender_ID() {
        return Recommender_ID;
    }

    public void setRecommender_ID(String recommender_ID) {
        Recommender_ID = recommender_ID;
    }

    public String getReg_Date() {
        return Reg_Date;
    }

    public void setReg_Date(String reg_Date) {
        Reg_Date = reg_Date;
    }

    private int Memeber_Num;
    private String ID;
    private String PASSWORD;
    private String Name;
    private String Birth;
    private String Gender;
    private String Email;
    private String Phone;
    private String Recommender_ID;
    private String Reg_Date;

}
