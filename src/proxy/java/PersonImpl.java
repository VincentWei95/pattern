package proxy.java;

public class PersonImpl implements Person {
    /**
     * 姓名
     */
    String name;

    /**
     * 性别
     */
    String gender;

    /**
     * 兴趣
     */
    String interests;

    /**
     * 评分
     */
    int rating;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
