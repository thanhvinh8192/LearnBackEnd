package Database;

import java.sql.Timestamp;

public class Student {
    private  int id;
    private  String name, mssv, password, phone, address;
    private short age;
    private String email;
    private Timestamp created_timstamp;
    private Timestamp last_updated_timestamp;

    public Student(int id, String name, String mssv, String password, String phone, String address, short age, String email, Timestamp created_timstamp, Timestamp last_updated_timestamp) {
        this.id = id;
        this.name = name;
        this.mssv = mssv;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.email = email;
        this.created_timstamp = created_timstamp;
        this.last_updated_timestamp = last_updated_timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreated_timstamp() {
        return created_timstamp;
    }

    public void setCreated_timstamp(Timestamp created_timstamp) {
        this.created_timstamp = created_timstamp;
    }

    public Timestamp getLast_updated_timestamp() {
        return last_updated_timestamp;
    }

    public void setLast_updated_timestamp(Timestamp last_updated_timestamp) {
        this.last_updated_timestamp = last_updated_timestamp;
    }
}

