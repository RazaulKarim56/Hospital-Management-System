public class Billing {
    int billingNo = 1001;
    int patientId = 1;
    String patientName = "Rahim";
    float billingAmount = 1500.0f;

    public float method1(float amount) {
        System.out.println("Total amount using method1: " + amount);
        return amount;
    }

    public float method2(float consultation, float medicine) {
        float total = consultation + medicine;
        System.out.println("Total amount using method2: " + total);
        return total;
    }
}
