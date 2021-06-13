package dependency_injection.setter_injecttion.si_with_object;

public class Address {
    private String commune;
    private String district;
    private String province;

    @Override
    public String toString() {
        return "Address{" +
                "commune='" + commune + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
