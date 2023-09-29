package mini_assignment_3;

class Product {
    private String name;
    private String description;
    private double price;
    private Seller seller;

    public Product(String name, String description, double price, Seller seller) {
        this.name = name;
        this.setDescription(description);
        this.price = price;
        this.setSeller(seller);
    }

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
