package mvc2;

import com.amirkenesbay.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @NotBlank(message = "surname is required")
    private String surname;
    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int age;
    private String course;
    private Map<String, String> courses;
    private String sport;
    private Map<String, String> sports;
    private String[] subject;
    private Map<String, String> subjects;
    @NotBlank(message = "street is required")
    private String street;
    @NotBlank(message = "apartment is required")
    private String apartment;
    @NotBlank(message = "apartment is required")
    private String home;
    @CheckEmail
    private String site;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XXX-XX-XX")
    private String phoneNumber;

    public Student() {
        courses = new HashMap<>();
        courses.put("IT", "Information Technologies");
        courses.put("BM", "Business Management");
        courses.put("MS", "Math Science");

        sports = new HashMap<>();
        sports.put("FB", "Football");
        sports.put("BB", "Basketball");
        sports.put("VB", "Volleyball");

        subjects = new HashMap<>();
        subjects.put("MT", "Math");
        subjects.put("PH", "Physics");
        subjects.put("EN", "English");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Map<String, String> getSports() {
        return sports;
    }

    public void setSports(Map<String, String> sports) {
        this.sports = sports;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public Map<String, String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, String> subjects) {
        this.subjects = subjects;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", courses=" + courses +
                ", sport='" + sport + '\'' +
                ", sports=" + sports +
                ", subject=" + Arrays.toString(subject) +
                ", subjects=" + subjects +
                ", street='" + street + '\'' +
                ", apartment='" + apartment + '\'' +
                ", home='" + home + '\'' +
                ", site='" + site + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
