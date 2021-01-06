package Database21;


import java.sql.Timestamp;

public class Classroom {
    private int id;
    private String name;
    private String major;
    private  int total_student;
    private String teacher_name;
    private String teacher_phone;
    private Timestamp created_timestamp;
    private Timestamp last_updated_timestamp;

    public Classroom(int id, String name, String major, int total_student, String teacher_name, String teacher_phone, Timestamp created_timestamp, Timestamp last_updated_timestamp) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.total_student = total_student;
        this.teacher_name = teacher_name;
        this.teacher_phone = teacher_phone;
        this.created_timestamp = created_timestamp;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getTotal_student() {
        return total_student;
    }

    public void setTotal_student(int total_student) {
        this.total_student = total_student;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_phone() {
        return teacher_phone;
    }

    public void setTeacher_phone(String teacher_phone) {
        this.teacher_phone = teacher_phone;
    }

    public Timestamp getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(Timestamp created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public Timestamp getLast_updated_timestamp() {
        return last_updated_timestamp;
    }

    public void setLast_updated_timestamp(Timestamp last_updated_timestamp) {
        this.last_updated_timestamp = last_updated_timestamp;
    }

}
