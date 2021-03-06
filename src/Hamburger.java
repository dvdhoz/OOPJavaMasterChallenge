public class Hamburger {
    private String breadType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean onions;
    private boolean pickles;
    private String additional1Name;
    private String additional2Name;

    private double basePrice;
    private double lettucePrice;
    private double tomatoPrice;
    private double onionPrice;
    private double picklePrice;
    private double additional1Price;
    private double additional2Price;

    public Hamburger(String breadType, String meat, boolean lettuce, boolean tomato, boolean onions, boolean pickles) {
        this.breadType = breadType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onions = onions;
        this.pickles = pickles;
        this.basePrice = 2.00;
        this.lettucePrice = 0.50;
        this.tomatoPrice = 0.25;
        this.onionPrice = 0.75;
        this.picklePrice = 0.10;
    }

    public void setAdditional1Name(String name, double price) {
        this.additional1Name = name;
        this.additional1Price = price;
    }

    public double orderTotal() {
        double price = basePrice;
        if(additional1Name != null) {
            System.out.println("adding " + additional1Name + " for a price of " + additional1Price);
            price += additional1Price;
        }
        System.out.println("Base hamburger price = " + basePrice);
        while(lettuce) {
            System.out.println("includes lettuce = " + lettucePrice);
            price += this.lettucePrice;
            break;
        }
        while(tomato) {
            System.out.println("includes tomato = " + tomatoPrice);
            price += this.tomatoPrice;
            break;
        }
        while(onions) {
            System.out.println("includes onions = " + onionPrice);
            price += this.onionPrice;
            break;
        }
        while(pickles) {
            System.out.println("includes pickles = " + picklePrice);
            price+= this.picklePrice;
            break;
        }
        return price;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setOnions(boolean onions) {
        this.onions = onions;
    }

    public void setPickles(boolean pickles) {
        this.pickles = pickles;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnions() {
        return onions;
    }

    public boolean isPickles() {
        return pickles;
    }
}

