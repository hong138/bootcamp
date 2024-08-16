
public class Equipment {
  // 1. attributes
  private int productId;
  private String productName;
  private int productionDate;
  private double length;
  private double width;
  private double height;

  // All arguments (parameters) constructor
  public Equipment(int productId, String productName, int productionDate, double length, double width, double height){
    this.productId = productId;
    this.productName = productName;
    this.productionDate = productionDate;
    this.length = length;
    this.width = width;
    this.height = height;

  }

  // instance method
  public void setProductId(int productId){
    this.productId = productId;
  }

  public void setProductName(String productName){
    this.productName = productName;
  }

  public void setProductionDate(int productionDate){
    this.productionDate = productionDate;
  }

  public void setLength(double length){
    this.length = length;
  }

  public void setWidth(double width){
    this.width = width;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public int getProductId(){
    return this.productId;
  }

  public String getProductName(){
    return this.productName;
  }

  public int getProductionDate(){
    return this.productionDate;
  }

  public double getLength(){
    return this.length;
  }

  public double getWidth(){
    return this.width;
  }

  public double getHeight(){
    return this.height;
  }

  // Presenetation

  public String getEquipmentId() {
    String productIdStr = String.valueOf(productId);
    return productName + productIdStr;
  }

  public double getArea(){
    return this.length * this.width;
  }

  public double getVolume(){
    return this.length * this.width * this.height;
  }

}

