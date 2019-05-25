package proxy.java;

/**
 * 客户端对象
 */
public interface Person {
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setRating(int rating);

    String getName();
    String getGender();
    String getInterests();
    int getRating();
}
