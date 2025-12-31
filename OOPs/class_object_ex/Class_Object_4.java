package class_object_ex;

// Access class variables using object reference.

class Country {

    String state;
    String district;
    String taluka;
    String village;

    public Country(String state, String district, String taluka, String village) {
        this.state = state;
        this.district = district;
        this.taluka = taluka;
        this.village = village;
    }

    public void show() {
        System.out.println("State: " + state);
        System.out.println("District: " + district);
        System.out.println("Taluka: " + taluka);
        System.out.println("Village: " + village);
        System.out.println("---------------------------------------");
    }
}

public class Class_Object_4 {

    public static void main(String[] args) {

        Country c1 = new Country("Maharashtra", "Dharashiv", "Washi", "Pargaon");
        c1.show();

        Country c2 = new Country("Maharashtra", "Solapur", "Barshi", "Khadkoni");
        c2.show();
    }
}
