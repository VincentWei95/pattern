package build.android;

/**
 * 构建者模式的另一种写法
 */
public class PersonBuilder {
    private final String head;
    private final String body;
    private final String armLeft;
    private final String armRight;
    private final String legLeft;
    private final String legRight;

    public PersonBuilder(PersonBuilder.Builder builder) {
        this.head = builder.head;
        this.body = builder.body;
        this.armLeft = builder.armLeft;
        this.armRight = builder.armRight;
        this.legLeft = builder.legLeft;
        this.legRight = builder.legRight;
    }

    public static final class Builder {
        String head;
        String body;
        String armLeft;
        String armRight;
        String legLeft;
        String legRight;

        public Builder() {

        }

        public Builder head(String head) {
            this.head = head;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder armLeft(String armLeft) {
            this.armLeft = armLeft;
            return this;
        }

        public Builder armRight(String armRight) {
            this.armRight = armRight;
            return this;
        }

        public Builder legLeft(String legLeft) {
            this.legLeft = legLeft;
            return this;
        }

        public Builder legRight(String legRight) {
            this.legRight = legRight;
            return this;
        }

        public PersonBuilder build() {
            return new PersonBuilder(this);
        }
    }
}
