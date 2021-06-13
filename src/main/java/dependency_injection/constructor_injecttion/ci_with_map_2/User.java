package dependency_injection.constructor_injecttion.ci_with_map_2;

public class User {
    private int uid;
    private String username;
    private String address;
    private float score;

    public User(int uid, String username, String address, float score) {
        this.uid = uid;
        this.username = username;
        this.address = address;
        this.score = score;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
