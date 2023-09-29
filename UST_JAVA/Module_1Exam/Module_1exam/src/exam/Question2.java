package exam;

public class Question2 {
	private int productACount;
	private int productASellingPrice;
	private int ProductBCount;
	private int ProductBSellingPrice;
	public Question2(int productCount, int productSellingPrice, int productBCount, int productBSellingPrice) {
		super();
		this.productACount = productACount;
		this.productASellingPrice = productASellingPrice;
		ProductBCount = productBCount;
		ProductBSellingPrice = productBSellingPrice;
	}
	public int getProductCount() {
		return productACount;
	}
	public void setProductCount(int productACount) {
		this.productACount = productACount;
	}
	public int getProductSellingPrice() {
		return productASellingPrice;
	}
	public void setProductSellingPrice(int productASellingPrice) {
		this.productASellingPrice = productASellingPrice;
	}
	public int getProductBCount() {
		return ProductBCount;
	}
	public void setProductBCount(int productBCount) {
		ProductBCount = productBCount;
	}
	public int getProductSellingPrice1() {
		return ProductBSellingPrice;
	}
	public void setProductSellingPrice1(int productBSellingPrice) {
		ProductBSellingPrice = productBSellingPrice;
	}
	@Override
	public String toString() {
		return "Question2 [productACount=" + productACount + ", productASellingPrice=" + productASellingPrice
				+ ", ProductBCount=" + ProductBCount + ", ProductBSellingPrice=" + ProductBSellingPrice + "]";
	}
	

}
