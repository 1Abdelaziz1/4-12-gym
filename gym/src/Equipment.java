public class Equipment {
    // Attributes
    private String equipmentName;
    private String equipmentCode;
    private int quantity;
    private String equipmentPhoto; // Optional

    //constructor
    public Equipment(String equipmentName, String equipmentCode,
                     int quantity, String equipmentPhoto) {
        this.equipmentName = equipmentName;
        this.equipmentCode = equipmentCode;
        this.quantity = quantity;
        this.equipmentPhoto = equipmentPhoto;
    }

    //getters and setters
    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEquipmentPhoto() {
        return equipmentPhoto;
    }

    public void setEquipmentPhoto(String equipmentPhoto) {
        this.equipmentPhoto = equipmentPhoto;
    }

}
