class Organization{
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;
    public Organization(int oC, String oN, String oA) {
        this.organizationCode = oC;
        this.organizationName = oN;
        this.organizationAddress = oA;
    }
    public int getOC() {
        return organizationCode;
    }

    public String getON() {
        return organizationName;
    }

    public String getOA() {
        return organizationAddress;
    }
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
}

public class Organization {
    public static void main(String[] args) {
        Organization org = new Organization(1, "ABC Corp", "123 Main St");
        org.printDetails();
    }
}
