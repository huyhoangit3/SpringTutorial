package dependency_injection.constructor_injecttion.ci_with_object;

public class Address {
    private String xa;
    private String huyen;

    public Address(String xa, String huyen) {
        this.xa = xa;
        this.huyen = huyen;
    }

    @Override
    public String toString() {
        return "Address{" +
                "xa='" + xa + '\'' +
                ", huyen='" + huyen + '\'' +
                '}';
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }
}
